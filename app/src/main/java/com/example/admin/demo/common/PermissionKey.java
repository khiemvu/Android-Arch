package com.example.admin.demo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiepnm on 6/26/14.
 */
public enum PermissionKey
{
    // new permission key
    STAFF_ADD("STAFF:ADD"),
    STAFF_STATUS_EDIT("STAFF:STATUS:EDIT"),
    STAFF_DETAIL_EDIT("STAFF:DETAIL:EDIT"),
    STAFF_PASSWORD_GENERATE("STAFF:PASSWORD:GENERATE"),
    STAFF_DETAIL_VIEW("STAFF:DETAIL:VIEW"),
    ROLE_ADD("ROLE:ADD"),
    ROLE_ASSIGN("ROLE:ASSIGN"),
    ROLE_DELETE("ROLE:DELETE"),
    ROLE_EDIT("ROLE:EDIT"),
    ROLE_VIEW("ROLE:VIEW"),
    COMPANY_INFO_EDIT("COMPANY_INFO:EDIT"),
    CUSTOMER_REGISTRATION_SETTING("CUSTOMER:REGISTRATION:SETTING"),
    COMPANY_NEWS_ADD_NEWS("COMPANY_NEWS:ADD_NEWS"),
    DATA_ENTRY_ADD_ORDER("DATA_ENTRY:ORDER:ADD"),
    DATA_ENTRY_RECEIVE("DATA_ENTRY:RECEIVE"),
    UNIT_TAG_ASSIGN("UNIT:TAG:ASSIGN"),
    DATA_ENTRY_SPEC_EDIT("DATA_ENTRY:SPEC:EDIT"),
    UNIT_ADDITIONAL_CUSTOMER_VIEW("UNIT:ADDITIONAL:CUSTOMER_VIEW"),
    DATA_ENTRY_SPEC_CUSTOM_FIELD("DATA_ENTRY:SPEC:CUSTOM_FIELD"),
    UNIT_ADDITIONAL_STAFF_VIEW("UNIT:ADDITIONAL:STAFF_VIEW"),
    DATA_ENTRY_SPEC_FIELD_ON_OFF("DATA_ENTRY:SPEC:FIELD:ON_OFF"),
    DATA_ENTRY_SPEC_CUSTOM_FIELD_ADD("DATA_ENTRY:SPEC:CUSTOM_FIELD:ADD"),
    DATA_ENTRY_ORDER_VIEW("DATA_ENTRY:ORDER:VIEW"),
    DATA_ENTRY_ORDER_ADD("DATA_ENTRY:ORDER:ADD"),
    DATA_ENTRY_INVOICE_ADD("DATA_ENTRY:INVOICE:ADD"),
    DATA_ENTRY_INVOICE_VIEW("DATA_ENTRY:INVOICE:VIEW"),
    DATA_ENTRY_INVOICE_ADD_SUBTOTAL_FIELD("DATA_ENTRY:INVOICE:ADD_SUBTOTAL_FIELD"),
    UNIT_IMAGES_ADD("UNIT:IMAGES:ADD"),
    UNIT_IMAGES_DELETE("UNIT:IMAGES:DELETE"),
    UNIT_LOCATION_VIEW("UNIT:LOCATION:VIEW"),
    UNIT_ADDITIONAL_VIEW("UNIT:ADDITIONAL:VIEW"),
    UNIT_IMAGES_SHOW("UNIT:IMAGES:SHOW"),
    UNIT_BASIC_VIEW_ALL_PRICE("UNIT:BASIC:VIEW_ALL_PRICE"),
    UNIT_BASIC_PRICE_SELECT("UNIT:BASIC:PRICE:SELECT"),
    SALE_PENDING_EDIT("SALE:PENDING:EDIT"),
    QUOTE_SAVE("QUOTE:SAVE"),
    SALE_RESERVE("SALE:RESERVE"),
    CUSTOMER_ASSET_VIEW("CUSTOMER:ASSET:VIEW"),
    UNIT_INVENTORY_REPORT_VIEW("UNIT:INVENTORY_REPORT:VIEW"),
    UNIT_BASIC_EDIT("UNIT:BASIC:EDIT"),
    UNIT_BASIC_PRICE_EDIT("UNIT:BASIC:PRICE:EDIT"),
    UNIT_BASIC_VIEW_ALL_COST("UNIT:BASIC:VIEW_ALL_COST"),
    UNIT_HOT_UPDATE("UNIT:HOT:UPDATE"),
    SALE_SOLD_VIEW_LIST("SALE:SOLD:VIEW_LIST"),
    INVOICE_SHOW_PRICE("INVOICE_PRICE:VIEW"),
    SALE_RESERVED_EDIT("SALE:RESERVED:EDIT"),
    SALE_RESERVED_SOLD("SALE:RESERVED:SOLD"),
    UNIT_RESERVED_VIEW("UNIT:RESERVED:VIEW"),
    STORE_MANAGE("STORE:MANAGE"),
    DATA_ENTRY_WORK_ORDER_ADD("DATA_ENTRY:WORK_ORDER:ADD"),
    UNIT_BILLING_INFO_VIEW("UNIT:BILLING_INFO:VIEW"),
    UNIT_TAKE_INVENTORY_VIEW("UNIT:TAKE_INVENTORY:VIEW"),
    UNIT_ATTACHMENT_ADD("UNIT:ATTACHMENT:ADD"),
    UNIT_CHECK_IN_OUT("UNIT:CHECK_IN_OUT"),
    SALES_ANALYSIS_VIEW("SALES_ANALYSIS:VIEW"),
    SALE_MULTIPLE_STORE("SALES:MULTIPLE_STORE"),
    PART_ADJUSTMENT_EDIT("PART:ADJUSTMENT:EDIT"),
    CUSTOMER_MANAGE_ALL("CUSTOMER:MANAGE_ALL"),
    QUOTE_SOLD_EDIT("QUOTE:SOLD:EDIT"),
    INVOICE_FEE_VIEW("INVOICE_FEE:VIEW"),
    ADMINISTRATION_RIGHTS("ADMINISTRATOR_RIGHTS"),
    FINANCE_ACCOUNTING("FINANCE:ACCOUNTING"),
    USE_UNIT_FEATURE("UNIT:USE_UNIT_FEATURE"),
    COMPANY_MULTIPLE_COMPANY("COMPANY:MULTIPLE_COMPANY"),
    RECEIVABLES_MANAGEMENT("RECEIVABLES:MANAGEMENT"),
    RECEIVABLES_PAYMENT("RECEIVABLES:PAYMENT"),
    CARE_CUSTOMER("CUSTOMER:CARE_CUSTOMER"),
    ADD_STAFF_DOCUMENT("STAFF:ADD_DOCUMENT");

    private String permissionKey;
    private static Map<String, PermissionKey> keyStringMap = new HashMap<String, PermissionKey>();

    static
    {
        for (PermissionKey perKey : PermissionKey.values())
        {
            keyStringMap.put(perKey.getValue(), perKey);
        }
    }

    PermissionKey(String permissionKey)
    {
        this.permissionKey = permissionKey;
    }

    public String getPermissionKey()
    {
        return permissionKey;
    }

    public void setPermissionKey(String permissionKey)
    {
        this.permissionKey = permissionKey;
    }

    public String getValue()
    {
        return permissionKey;
    }

    public static PermissionKey getKeyFromValue(String value)
    {
        return keyStringMap.get(value);
    }
}