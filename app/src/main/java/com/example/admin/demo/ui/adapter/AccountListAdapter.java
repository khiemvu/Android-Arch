package com.example.admin.demo.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.example.admin.demo.R;
import com.example.admin.demo.common.StringUtils;
import com.example.admin.demo.repository.dto.UserDTO;

import java.util.List;

/**
 * Created by binhtv on 3/23/2015.
 */
public class AccountListAdapter extends ArrayAdapter<UserDTO>
{
    //    DisplayImageOptions options;
    List<UserDTO> accountItemList;
    Context context;

    public AccountListAdapter(Context context, List<UserDTO> accountItemList)
    {
        super(context, R.layout.auth_account_item, accountItemList);
//        options = new DisplayImageOptions.Builder()
//                .resetViewBeforeLoading(true)
//                .showImageForEmptyUri(R.drawable.avatar_default_account)
//                .showImageOnFail(R.drawable.avatar_default_account)
//                .bitmapConfig(Bitmap.Config.RGB_565)
//                .cacheInMemory(true)
//                .cacheOnDisc(true)
//                .build();
        this.accountItemList = accountItemList;
        this.context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder = null;
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.auth_account_item, null, false);
            viewHolder = new ViewHolder();
            viewHolder.ivAvatar = (ImageView) convertView.findViewById(R.id.auth_account_item_ivAvatar);
            viewHolder.ivRememberPassword = (ImageView) convertView.findViewById(R.id.ivRememberPassword);
            viewHolder.tvAccountName = (TextView) convertView.findViewById(R.id.auth_account_item_tvAccountName);
            viewHolder.tvAccountEmail = (TextView) convertView.findViewById(R.id.auth_account_item_tvAccountEmail);
            viewHolder.tvDealerName = (TextView) convertView.findViewById(R.id.auth_account_item_tvDealerName);
            viewHolder.progress_loading = (ProgressBar) convertView.findViewById(R.id.progress_loading);
            viewHolder.sectionView = convertView.findViewById(R.id.auth_account_item_section);
            viewHolder.rlWholeLayout = (RelativeLayout) convertView.findViewById(R.id.rlWholeLayout);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final UserDTO accountItem = getItem(position);
//        viewHolder.rlWholeLayout.setOnClickListener(new View.OnClickListener()
//        {
//            @TargetApi(Build.VERSION_CODES.M)
//            @Override
//            public void onClick(View v)
//            {
//                UserDTO userDTO = UserHolder.getInstance().getUserList().get(accountItem.getWebUserId());
//                ApplicationStateHolder applicationStateHolder = ApplicationStateHolder.getInstance();
//                User user = RealmConfig.getRealmConfig().where(User.class).equalTo(User.WEB_ID, accountItem.getWebUserId()).findFirst();
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
//                {
//                    FingerprintManager fingerprintManager = (FingerprintManager) applicationStateHolder.getFragmentContainerModelAwareActivity().getSystemService(FINGERPRINT_SERVICE);
//                    if (ActivityCompat.checkSelfPermission(applicationStateHolder.getFragmentContainerModelAwareActivity(), Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED)
//                    {
//                        return;
//                    }
//                    if (!fingerprintManager.isHardwareDetected())
//                    {
//                        if (StringUtils.isNotEmpty(userDTO.getToken()) || (user != null && StringUtils.isEmpty(user.getPassword())))
//                        {
//                            AuthenUtils.switchToNextScreen(context, accountItem, userDTO);
//                        }
//                        else
//                        {
//                            doLogin(accountItem);
//                        }
//                    }
//                    else
//                    {
//                        if (StringUtils.isNotEmpty(userDTO.getToken()))
//                        {
//                            AuthenUtils.switchToNextScreen(context, accountItem, userDTO);
//                        }
//                        else
//                        {
//                            ListAccountModel listAccountModel = (ListAccountModel) applicationStateHolder.getActiveModel();
//                            applicationStateHolder.setActiveDialogModel(new FingerprintDialogModel(listAccountModel, accountItem));
//                        }
//                    }
//                }
//                else
//                {
//                    AuthenUtils.processWhenClickAnAccount(context, accountItem);
//                }
//            }
//        });
//        String imageUrl = com.gem.prism.authentication.common.utils.ImageUtils.getURLImage("", accountItem.getPhotoId(), ImageType.NORMAL);
        viewHolder.tvAccountName.setText(accountItem.getFirstName() + " " + accountItem.getLastName());
        viewHolder.tvAccountEmail.setText(accountItem.getEmail());
        viewHolder.tvDealerName.setText("Khiem Corp");
        viewHolder.sectionView.setVisibility(isNeedSection(position) ? View.VISIBLE : View.GONE);
        viewHolder.ivRememberPassword.setVisibility(StringUtils.isEmpty(accountItem.getToken()) ? View.GONE : View.VISIBLE);
//        if (accountItem.isCustomer())
//        {
//            viewHolder.tvDealerName.setText(ApplicationStateHolder.getInstance().getFragmentContainerModelAwareActivity().getString(R.string.authen_moolaCustomer));
//            viewHolder.tvDealerName.setTextColor(getContext().getResources().getColor(R.color.green_light));
//        }
//        else
//        {
//            viewHolder.tvDealerName.setTextColor(getContext().getResources().getColor(R.color.black));
//        }
        final ViewHolder finalViewHolder1 = viewHolder;
//        if (StringUtils.isEmpty(accountItem.getPhotoId()))
//        {
//            finalViewHolder1.ivAvatar.setImageResource(R.drawable.avatar_default_account);
//        }
//        else
//        {
//            ImageLoader.getInstance().displayImage(imageUrl, finalViewHolder1.ivAvatar, options);
//        }
//        viewHolder.llDeleteItem.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                FragmentContainerModelAwareActivity activity = ApplicationStateHolder.getInstance().getFragmentContainerModelAwareActivity();
//                AlertDialogHolder.getInstance().show(activity, activity.getString(R.string.authen_message_deleteAccountConfirm),
//                        activity.getString(R.string.common_cancel), activity.getString(R.string.common_ok), new DialogActionImpl()
//                        {
//                            @Override
//                            public void actionForCancel()
//                            {
//                                ProgressDialogHolder.getInstance().dismissDialog();
//                            }
//
//                            @Override
//                            public void execute(Context context)
//                            {
//                                accountItemList.remove(position);
//                                Map<String, UserDTO> userDTOMap = UserHolder.getInstance().getUserList();
//                                userDTOMap.remove(accountItem.getWebUserId());
//                                UserHolder.getInstance().setUserList(userDTOMap);
//                                notifyDataSetChanged();
//                                EventBus.getDefault().post(new AuthenEvents.UpdateUIAfterDeleteAccount());
//                            }
//                        });
//            }
//        });
        return convertView;
    }

    private boolean isNeedSection(int position)
    {
        if ((position + 1) == getCount())
        {
            return false;
        }
        UserDTO accountItem = getItem(position);
        UserDTO nextItem = getItem(position + 1);
        return !accountItem.getEmail().equalsIgnoreCase(nextItem.getEmail());
    }

    private static class ViewHolder
    {
        ImageView ivAvatar;
        ImageView ivRememberPassword;
        TextView tvAccountName;
        TextView tvAccountEmail;
        TextView tvDealerName;
        View sectionView;
        RelativeLayout rlWholeLayout;
        ProgressBar progress_loading;
        LinearLayout llDeleteItem;
    }
}
