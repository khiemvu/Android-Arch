package com.example.admin.demo.common;

/**
 * User: AnhNT
 * Date: 5/12/14
 */
public enum MessageKey
{
    CAN_NOT_ASSIGN_ASSIGNED_CUSTOMER("sales.messageFail.canNotAssignAssignedCustomer"),
    CAN_NOT_DELETED_WORK_ORDER_LINE_ORDERED_PART("sales.messageFail.canNotDeletedWorkOrderLineWhenOrderedPart"),
    CANNOT_UPDATE_BILLED_EQUIPMENT("sales.messageFail.canNotUpdateBilledEquipment"),
    MESSAGE_FAIL_CANNOT_DELETE_BILLED_EQUIPMENT("sales.messageFail.canNotDeleteBilledEquipment"),
    MESSAGE_FAIL_TRANSFER_ERROR("messageFail.finance.invalidTransfer"),
    financal_messageFail_withdrawAmountBiggerThanBalance("finance.withdrawBiggerThanBalance"),
    sales_messageFail_canNotDeleteInvoicedEquipment("sales.messageFail.canNotDeleteInvoicedEquipment"),
    sales_messageFail_deleteOrderContainingInvoices("sales.messageFail.deleteOrderContainingInvoices"),
    sales_messageFail_payableDateMustBiggerBillDate("sales.messageFail.payableDateMustBiggerBillDate"),
    BILL_ERROR_EQUIPMENT_HAS_BEEN_ELETED("sales.messageFail.equipmentHasBeenDeleted"),
    BILL_ERROR_PART_ORDER_LINE_WAS_DELETED("sale.messageFail.partOrderLineWasDeleted"),
    CONTAIN_BILLED_PART_ORDER_LINE("sale.messageFail.containBilledPartOrderLine"),
    BILL_ERROR_WANTED_QTY_EXCEED_AVAILABLE_PART_QTY("sale.messageFail.wantedPartQtyExceedAvailablePartQty"),
    BILL_ERROR_WANTED_QTY_SMALLER_BILLED_QTY("sale.messageFail.wantedQtySmallerBilledQty"),
    NOT_UPDATE_DELETED_BILL("sales.messageFail.notUpdateDeletedBill"),
    BILL_FOR_EXPENSE_VAT_EXISTED("sales.messageFail.BillForExpenseVATEXISTED"),
    EQUIPMENT_WAS_IN_CLOSED_BILL("sales.messageFail.equipmentWasInClosedBill"),
    sales_messageFail_total_bill_notEqual("sales.messageFail.totalBillValueNotEqual"),
    sales_messageFail_billDateBiggerCurrentTime("sales.messageFail.billDateBiggerCurrentTime"),
    sales_messageFail_billWasClosed("sales.messageFail.billWasClosed"),
    sales_messageFail_cashOvermuchAmount("sales.messageFail.cashOvermuchAmount"),
    sales_messageFail_billError("sales.messageFail.billError"),
    sale_messageFail_duplicateBillingNumber("sales.messageFail.duplicateBillNumber"),
    sales_messageFail_equipmentWasInAnotherBil("sales.messageFail.equipmentWasInAnotherBil"),
    SALE_MESSAGE_FAIL_EXIST_PRODUCT_OF_MODEL_GROUP("sales.messageFail.existProductOfModelGroup"),
    sales_messageFail_duplicateLocation("sales.messageFail.duplicateLocation"),
    SALE_MESSAGE_FAIL_QUOTE_IS_TOO_OLD_FOR_UPDATE("sales.messageFail.quoteIsTooOldForUpdate"),
    SALE_MESSAGE_FAIL_TOTAL_RECEIVED_EXCEED_QUANTITY("sales.messageFail.totalReceivedExceedQuantity"),
    SALE_MESSAGE_FAIL_TOTAL_ON_HAND_PART_LESS_THAN_ZERO("sales.messageFail.totalOnHandPartLessThanZero"),
    SPEC_WAS_DELETED_OR_NOT_EXIST("sales.messageFail.specIsDeletedOrNotExist"),
    SALE_MESSAGE_FAIL_DUPLICATE_PRODUCT("sales.messageFail.duplicateProduct"),
    CAN_NOT_UPDATE_PRODUCT_BECAUSE_PRODUCT_WAS_DELETED("sales.messageFail.canNotUpdateProductBecauseProductIsDeleted"),
    CAN_NOT_DELETE_BECAUSE_EQUIPMENT_OF_PRODUCT_EXIST("sales.messageFail.canNotDeleteBecauseEquipmentOfProductExists"),
    CAN_NOT_DELETE_BECAUSE_PRODUCT_WAS_USED_IN_ORDER("sales.messageFail.canNotDeleteBecauseProductIsUsedInOrder"),
    CAN_NOT_UPDATE_BECAUSE_PRODUCT_CODE_IS_DUPLICATED("sales.messageFail.canNotUpdateProductBecauseProductCodeIsDuplicated"),
    MODEL_EXIST("sales.messageFail.modelExist"),
    CAN_NOT_UPDATE_PRODUCT_BECAUSE_PRODUCT_CODE_IS_EMPTY("sales.messageFail.canNotUpdateProductBecauseProductCodeIsEmpty"),
    AUTHEN_MODEL_EXISTED("sales.messageFail.modelExist"),
    SPEC_OUT_OF_DATE("sales.messageFail.specOutOfDate"),
    SALES_MESSAGE_SPEC_FIELD_DUPLICATE("sales.messageFail.specFieldIsDuplicate"),
    SALES_REQUIRE_NOT_EMPTY_IN_A_LANGUAGE_AT_LEAST("sales.messageFail.requireNotEmptyInALanguageAtLeast"),
    SYSTEM_CURRENTLY_UNDERGOING_MAINTENANCE("messageFail.systemCurrentlyUndergoingMaintenance"),
    SYSTEM_IS_RESTARTING("messageFail.systemIsRestarting"),
    CAN_NOT_COMPLETE_QUOTE_WHEN_HAVING_OPEN_WORK_ORDER("sales.messageFail.cannotCompleteQuoteWhenHavingOpenWorkOrder"),
    START_DATE_MUST_BE_LESS_THAN_END_DATE("sales.messageFail.startDateMustBeLessThanEndDate"),
    CAN_NOT_GET_REPORT_BECAUSE_STORE_DELETED("sales.messageFail.canNotGetReportBecauseStoreDeleted"),
    EQUIPMENT_WAS_SOLD("sales.messageFail.equipmentWasSold"),
    EQUIPMENT_WAS_RESERVED("sales.messageFail.equipmentWasReserved"),
    CAN_NOT_DELETE_DELETED_WORK_ORDER("sales.messageFail.canNotDeleteDeletedWorkOrder"),
    CAN_NOT_DELETED_WORK_ORDER_ORDERED_PART("sales.messageFail.canNotDeletedWorkOrderOrderedPart"),
    CAN_NOT_DELETE_CLOSED_WORK_ORDER("sales.messageFail.canNotDeleteClosedWorkOrder"),
    CAN_NOT_DELETED_WORK_ORDER_RECEIVED_PART("sales.messageFail.canNotDeletedWorkOrderReceivedPart"),
    DUPLICATE_WORK_ORDER_NUMBER("sales.messageFail.duplicateWorkOrderNumber"),
    CAN_NOT_UPDATE_DELETED_WORK_ORDER("sales.messageFail.canNotUpdateDeletedWorkOrder"),
    CAN_NOT_START_WORK_ORDER_WITHOUT_LABOR("sales.messageFail.cannotStartWorkOrderWithoutLabor"),
    CAN_NOT_UPDATE_CLOSED_WORK_ORDER("sales.messageFail.canNotUpdateCloseWorkOrder"),
    CAN_NOT_UPLOAD_DOCUMENT_DELETED_WORK_ORDER("sales.messageFail.canNotUploadDocumentForDeletedWorkOrder"),
    CAN_NOT_UPLOAD_DOCUMENT_CLOSED_WORK_ORDER("sales.messageFail.canNotUploadDocumentForClosedWorkOrder"),
    WORK_ORDER_DOCUMENT_DELETED("sales.messageFail.canNotDeleteBecauseWorkOrderDocumentDeleted"),
    CAN_NOT_DELETE_DOCUMENT_DELETED_WORK_ORDER("sales.messageFail.canNotDeleteBecauseWorkOrderDeleted"),
    CAN_NOT_DELETE_DOCUMENT_CLOSED_WORK_ORDER("sales.messageFail.canNotDeleteBecauseWorkOrderClosed"),
    DUPLICATE_STORE("sales.messageFail.duplicateStoreNumber"),
    NO_CHANGE_STORE_NUMBER("sales.messageFail.canNotChangeStoreNumber"),
    NOT_DELETE_STORE_IN_USE("sales.messageFail.canNotDeleteStoreBecauseStoreIsInUse"),
    NOT_DELETE_STORE_USER_IN_ORDER("sales.messageFail.canNotDeleteStoreBecauseStoreIsUsedInOrder"),
    STORE_DELETED("sales.messageFail.storeDeleted"),
    REQUIRE_APP_VERSION("messageFail.versionParameterIsRequired"),
    VERSION_APP_OUT_OF_DATE("messageFail.versionAppOutOfDate"),
    VERSION_DATA_OUT_OF_DATE("messageFail.versionDataOutOfDate"),
    THERE_ARE_NEW_FEATURES("messageWarring.thereAreNewFeatures"),
    THERE_IS_A_NEW_VERSION("messageWarring.thereIsANewVersion"),
    FAIL_CUSTOM_KEY_EXISTED("sales.messageFail.customData.customKeyExisted"),
    FAIL_INCORRECT_PASSWORD("auth.messageFail.incorrectPassword"),
    FAIL_INCORRECT_OLD_PASSWORD("auth.messageFail.oldPasswordIncorrect"),
    FAIL_INCORRECT_SECURITY_ANSWER("auth.messageFail.incorrectSecurityAnswer"),
    FAIL_EMAIL_ALREADY_IN_USED("messageFail.emailIsAlreadyInUsed"),
    FAIL_MULTIPLE_DEALER_LOGIN("auth.messageSuccess.multipleDealerLogin"),
    NEED_TO_CREATE_PASSWORD_AND_SECURITY_QUESTION("auth.messageSuccess.needToCreatePassword&SecurityQuestion"),
    INVALID_INVITATION_CODE("auth.messageFail.invalidInvitationCode"),
    INVITATION_CODE_FAIL_USED("auth.messageFail.invitationCodeIsUsed"),
    NEED_TO_ANSWER_SECURITY_QUESTION("auth.messageSuccess.needToAnswerSecurityQuestion"),
    ENTERPRISE_LOGO_NOT_FOUND("auth.messageFail.enterpriseLogoNotFound"),
    INTERRUPT_CONNECTION("authen.message.interruptedConnection"),
    ALL_DATA_OUT_OF_DATE("all.dataOutOfDate"),
    DUPLICATE_SETUP_COMPANY("auth.messageFail.duplicateSetupCompany"),
    ROLE_NOT_FOUND("staffLite.messageFail.roleNotFound"),
    FIRST_NAME_BLANK("staffLite.messageFail.firstNameBlank"),
    LAST_NAME_BLANK("staffLite.messageFail.lastNameBlank"),
    ROLE_NAME_EXIST("staffLite.messageFail.roleNameExists"),
    CAN_NOT_DELETE_ROLE_WITH_USER_ASSOCIATED("staffLite.messageFail.cannotDeleteRoleWithUsersAssociated"),
    RESET_CODE_INVALID("messageFail.resetCodeInvalid"),
    NEWS_DELETED_OR_NOT_FOUND("auth.messageFail.newsDeletedOrNotFound"),
    CAN_NOT_RESERVE_UNITS_FROM_OTHER_STORE("sales.messageFail.cannotReserveUnitsFromOtherStores"),
    CAN_NOT_SELL_UNIT_FROM_OTHER_STORES("sales.messageFail.cannotSellUnitsFromOtherStores"),
    CAN_NOT_ASSIGN_STORE_MANAGER_CAME_FROM_OTHER_STORE("sales.messageFail.canNotAssignStoreManagerCameFromOtherStore"),
    CANNOT_UPDATE_QUANTITY_GREATER_THAN_WO("sales.messageFail.cannotUpdateQuantityGreaterThanWO"),
    FINANCE_MESSAGE_FAIL_MISS_FROM_CASH_ACCOUNT_OF_PAID_REPAYMENT("finance.messageFail.missFromCashAccountOfPaidRepayment"),

    EQUIPMENT_NOT_FOUND("sales.messageFail.equipmentNotFound"),
    INVENTORY_PROCESS_FINISH("sales.messageFail.inventoryProcessFinish"),
    CONFIGURATION_NOT_FOUND("sales.messageFail.configurationNotFound"),
    EQUIPMENT_CONDITION_DUPLICATE("sales.messageFail.equipment.condition.duplicate"),
    QR_BLANK("sales.messageFail.qrCodeBlank"),
    QR_FAIL_USED("sales.messageFail.qrCodeIsUsedByOther"),
    QR_FAIL_SAME("sales.messageFail.newQrCodeSameWithOld"),
    ASSIGN_CONDITION_FAIL("sales.messageFail.conditionIncorrect"),
    WRONG_CUSTOM_TYPE("sales.messageFail.customData.wrongCustomType"),
    WRONG_AFFECTED_TYPE("sales.messageFail.customData.wrongAffectedType"),
    CUSTOM_KEY_EXISTED("sales.messageFail.customData.customKeyExisted"),
    PERMISSION_CHANGE("auth.messageSuccess.permissionListHashBeenChanged"),
    INVALID_ACCESS_TOKEN("auth.messageFail.invalidAccessToken"),
    DEALER_HAS_BEEN_SUSPEND("auth.messageFail.dealerHasBeenSuspended"),

    IMPORT_INVALID_FILE_FORMAT("sales.messageFail.invalidFileFormat"),
    USER_HAD_ALREADY_REGISTERED_DEVICE("auth.messageFail.userHasAlreadyRegisteredTheDevice"),
    SUCCESS("messageSuccess"),
    FAIL_ADD_OR_UN_FAVOURITE("customer.messageFail.addOrUnFavourite"),
    CUSTOMER_ALREADY_EXIST("sales.messageFail.customerAlreadyExists"),
    SALES_MESSAGE_FAIL_CAN_NOT_CLOSE_IN_COMPLETED_CYCLE_COUNT("sales.messageFail.canNotCloseInCompletedCycleCount"),
    CUSTOM_KEY_DELETED("sales.messageFail.customData.customKeyDeleted"),
    CUSTOM_KEY_INVALID_ID("sales.messageFail.customData.invalidId"),
    FAIL_INVALID_DATA("messageFail.invalidData"),
    UNKNOWN_EXCEPTION("messageFail.unknownException"),
    USER_NOT_FOUND("messageFail.userNotFound"),
    ENTERPRISE_NOT_FOUND("messageFail.enterpriseNotFound"),
    RE_INSTALL_APP("messageFail.reInstallApp"),
    FAIL_EMAIL_EXISTED("staffLite.messageFail.emailExisted"),
    FAIL_INVALID_EMAIL("messageFail.invalidEmail"),
    FAIL_USER_INACTIVE("auth.messageFail.userInactive"),
    FAIL_STORE_INACTIVE("staffLite.messageFail.userStoreIsInactive"),
    FAIL_REQUEST_RESERVATION_PENDING("sales.messageFail.customData.equipmentReservationPending"),
    FAIL_REQUEST_RESERVATION("sales.messageFail.customData.equipmentReserved"),
    FAIL_CANCEL_RESERVATION("sales.messageFail.customData.pendingReservationNotFound"),
    FAIL_ALREADY_CANCEL_RESERVATION("sales.messageFail.customData.equipmentCancelled"),
    SALES_MESSAGE_FAIL_WORK_ORDER_CONTAINS_NOT_TECHNICIAN("sales.messageFail.workOrderContainsNotTechnician"),
    WAITING("WAITING"),
    RESERVING("RESERVING"),
    CANCELED("CANCELED"),
    EQUIPMENT_CHECKED_OUT("sales.messageFail.equipmentAlreadyScanOut"),
    EQUIPMENT_NOT_CHECKED_OUT("sales.messageFail.equipmentNotScanOut"),
    HOUR_IS_NOT_VALID("sales.messageFail.checkInHourExceedMaxHour"),
    RETURN_DATE_INVALID("sales.messageFail.returnedDateInvalid"),
    HOUR_IN_VALID("sales.messageFail.hourInvalid"),
    CANNOT_SOLD_QUOTE_HAVING_CHECKED_OUT_EQUIPMENT("sales.messageFail.cannotSoldQuoteHavingCheckedOutEquipment"),
    CANNOT_SOLD_EQUIPMENT_WITHOUT_SERIAL_NUMBER("sales.messageFail.cannotSoldEquipmentWithOutSerialNumber"),
    CANNOT_SOLD_EQUIPMENT_WITHOUT_COLOR("sales.messageFail.cannotSoldEquipmentWithOutColor"),
    COLOR_ID_IS_REQUIRED("sales.messageFail.colorIdIsRequired"),
    COST_ID_IS_REQUIRED("sales.messageFail.costIdIsRequired"),
    SERIAL_NUMBER_IS_REQUIRED("sales.messageFail.serialNumberIsRequired"),

    FAIL_ASSIGN_TAG_DUPLICATE("sales.messageFail.newQrCodeSameWithOld"),
    FAIL_ASSIGN_TAG_USED("sales.messageFail.qrCodeIsUsedByOther"),
    FAIL_INVALID_ACTIVE_CODE("messageFail.invalidActiveCode"),
    FAIL_INVALID_RESET_CODE("messageFail.resetCodeInvalid"),
    FAIL_CANNOT_UPDATE_SOLD_EQUIPMENT("sales.messageFail.canNotUpdateSoldEquipment"),
    DOCUMENT_CLIENT_REFERENCE_REQUIRED("sales.messageFail.documentClientReferenceRequired"),
    LOCATION_SERVICE_DISABLE("common.message.error.locationServicesDisabled"),
    LOCATION_SERVICE_UNAVAILABLE("common.message.error.locationServicesUnavailable"),
    FAIL_CANNOT_CHANGE_CURRENCY_OF_STORE_HAVING_UNITS("sales.messageFail.cannotChangeCurrencyOfStoreHavingUnits"),

    //staff
    FAIL_CANNOT_ADD_STAFF_BECAUSE_STORE_DELETE("staffLite.messageFail.canNotAddStaffBecauseStoreDeleted"),
    FAIL_CANNOT_UPDATE_STAFF_BECAUSE_STORE_DELETE("staffLite.messageFail.canNotUpdateStaffBecauseStoreDeleted"),
    FAIL_CANNOT_CHANGE_STORE_BECAUSE_STAFF_IS_HEAD_OF_STORE("staffLite.messageFail.canNotChangeStoreBecauseStaffIsHeadOfStore"),
    STAFF_LITE_MESSAGE_FAIL_USER_SESSION_HAS_BEEN_EXPIRED("staffLite.messageFail.userSessionHasBeenExpired"),

    //data entry
    FAIL_ALREADY_RECEIVED("sales.messageFail.equipmentAlreadyReceived"),
    FAIL_NOT_YET_RECEIVED("sales.messageFail.equipmentNotYetReceived"),
    FAIL_CANNOT_CHANGE_SERIAL_NUMBER("sales.messageFail.canNotChangeSerialNumberWhenEquipmentWasInvoiced"),
    FAIL_DUPLICATE_SERIAL_NUMBER("sales.messageFail.duplicateSerialNumber"),
    FAIL_CANNOT_EDIT_UNIT("sales.messageFail.canNotUpdateNotReceivedEquipment"),
    DUPLICATE_ORDER("sales.messageFail.poOrderDuplicate"),
    NOT_DELETE_OPEN_OR_COMPLETED_ORDER("sales.messageFail.notDeleteOpenOrCompletedOrder"),
    DUPLICATE_PRODUCT_IN_ORDER_LINE("sales.messageFail.duplicateProductInOrderLine"),
    NOT_UPDATE_DELETED_ORDER("sales.messageFail.notUpdateDeletedPurchaseOrder"),
    NOT_UPDATE_NON_IN_PROCESS_PURCHASE_ORDER("sales.messageFail.notUpdateNonInProcessPurchaseOrder"),
    QUANTITY_TOO_BIG("sales.messageFail.totalQuantityTooBig"),
    FAIL_CAN_NOT_DELETE_RECEIVED_EQUIPMENT("sales.messageFail.canNotDeleteReceivedEquipment"),
    FAIL_NOT_DELETE_RECEIVED_ORDER("sales.messageFail.notDeleteReceivedOrder"),
    FAIL_CAN_NOT_FINISH_PART_ORDER_BECAUSE_THERE_NOT_PART_ORDER_LINE("sales.messageFail.canNotFinishPartOrderBecauseThereNoPartOrderLine"),
    FAIL_CAN_NOT_FINISH_PART_ORDER_BECAUSE_QUANTITY_OF_PART_IS_LESS_THAN_ONE("sales.messageFail.canNotFinishPartOrderBecauseQuantityOfPartIsLessThanOne"),
    FAIL_CAN_NOT_CREATE_OR_UPDATE_PART_ORDER_BECAUSE_QUANTITY_OF_PART_IS_TOO_BIG("sales.messageFail.canNotCreateOrUpdatePartOrderBecauseQuantityOfPartIsTooBig"),

    //DATA EXIT
    FAIL_UNIT_HAS_BEEN_RESERVED_BY_OTHER_USER("sales.messageFail.unitHasBeenReservedByAnotherUser"),
    FAIL_UNIT_HAS_BEEN_ADDED_TO_QUOTE("sales.messageFail.unitHasBeenAddedToQuote"),
    FAIL_UNIT_HAS_BEEN_RESERVED_BY_YOUR_SELF("sales.messageFail.unitHasBeenReservedByYourself"),
    FAIL_EQUIPMENT_ALREADY_RESERVED_IN_OTHER_QUOTE("sales.messageFail.equipmentAlreadyReservedInOtherQuote"),
    FAIL_EQUIPMENT_MUST_NOT_NULL("sales.messageFail.equipmentIdMustNotNull"),
    FAIL_CONTACT_NOT_FOUND("sales.messageFail.contactNotFound"),
    FAIL_CAN_NOT_EDIT_COMPLETED_QUOTE("sales.messageFail.cannotEditCompletedQuote"),
    FAIL_CAN_NOT_COMPLETE_PENDING_QUOTE("sales.messageFail.cannotCompletePendingQuote"),
    FAIL_NON_PENDING_QUOTE_SHOULD_NOT_EMPTY("sales.messageFail.nonPendingQuoteShouldNotEmpty"),
    FAIL_CAN_NOT_PENDING_SOLD_COMPLETED_QUOTE("sales.messageFail.cannotPendingSoldCompletedQuote"),
    FAIL_QUOTE_HAS_BEEN_RESERVED("sales.messageFail.quoteHasBeenReserved"),
    FAIL_EQUIPMENT_WAS_RESERVED_OR_SOLD("sales.messageFail.equipmentWasReservedOrSold"),
    SALES_MESSAGE_FAIL_EQUIPMENT_ID_TRANSFERRING("sales.messageFail.equipmentIsTransferring"),
    SALES_MESSAGE_FAIL_TRANSFER_RESERVED_EQUIPMENT("sales.messageFail.transferReservedEquipment"),
    FAIL_QUOTE_HAS_BEEN_DELETED("sales.messageFail.quoteDeleted"),
    FAIL_DATE_CANNOT_BE_TOO_FAR_BACK("sales.messageFail.DateCannotBeTooFarBack"),
    FAIL_DATE_CANNOT_BE_IN_FUTURE("sales.messageFail.DateCannotBeInFuture"),
    SALE_MESSAGE_FAIL_QUOTE_ERROR("sales.messageFail.quoteError"),
    SALE_MESSAGE_FAIL_OUT_OF_STOCK_PART("sales.messageFail.outOfStockPart"),
    SALE_MESSAGE_FAIL_NOT_ENOUGH_AVAILABLE_PART("sales.messageFail.notEnoughAvailablePart"),
    SALE_MESSAGE_FAIL_BRANCH_NOT_HAVE_THIS_PART("sales.messageFail.branchNotHaveThisPart"),
    SALE_MESSAGE_FAIL_SOLD_DATE_HAS_TO_BE_GREATER_THAN_DATE_IN("sales.messageFail.soldDateHasToBeGreaterThanDateIn"),
    SALE_MESSAGE_FAIL_CANNOT_SOLD_EQUIPMENT_WITHOUT_RECEIVING("sales.messageFail.cannotSoldEquipmentWithoutReceiving"),
    SALE_MESSAGE_FAIL_CANNOT_SOLD_EQUIPMENT_WITHOUT_SERIAL_NUMBER("sales.messageFail.cannotSoldEquipmentWithoutSerialNumber"),

    //INVOICE
    FAIL_DUPLICATE_INVOICE_ENTRY_NUMBER("sales.messageFail.duplicateInvoiceEntryNumber"),
    FAIL_NOT_UPDATE_DELETED_INVOICE_ENTRY("sales.messageFail.notUpdateDeletedInvoiceEntry"),
    FAIL_REQUIRE_AT_LEAST_ONE_INVOICE_LINE_WHEN_DONE("sales.messageFail.requireAtLeastOneInvoiceLineWhenDone"),
    FAIL_TOTAL_QUANTITY_EXCEED_QUANTITY_OF_ORDER_LINE("sales.messageFail.totalQuantityExceedQuantityOfOrderLine"),
    FAIL_NOT_ENOUGH_NO_NULL_SERIAL_NUMBER_EQUIPMENT("sales.messageFail.notEnoughNotNullSerialNumberEquipment"),
    FAIL_EXISTING_SERIAL_NUMBER_IN_ANOTHER_INVOICE("sales.messageFail.existingSerialNumberInAnotherInvoice"),
    FAIL_REQUIRE_DUE_DATE_WHEN_FINISH_INVOICE("sales.messageFail.requireDueDateWhenFinishInvoice"),
    FAIL_INVOICE_ENTRY_DELETED("sales.messageFail.invoiceEntryDeleted"),
    BILL_WAS_CLOSED("sales.messageFail.billWasClosed"),
    FAIL_CAN_NOT_CLOSE_WHEN_HAVE_IN_PROCESS_INVOICE("sales.messageFail.canNotCloseWhenHaveInProcessInvoice"),
    FAIL_ORDER_CLOSED("sales.messageFail.orderClosed"),
    FAIL_REQUIRE_VENDOR_WHEN_CLOSE_ORDER("sales.messageFail.requireVendorWhenCloseOrder"),
    FAIL_TOTAL_QUANTITY_OF_INVOICE_LINE_DIFFERENT("sales.messageFail.totalQuantityOfInvoiceLineNotEqualQuantityOfOrderLine"),
    DUPLICATE_INVOICE_NUMBER("sales.messageFail.duplicateInvoiceNumber"),
    EQUIPMENT_WAS_NOT_SOLD("sales.messageFail.equipmentWasNotSold"),
    EXCEED_REMAIN_QUANTITY_IN_QUOTE_PART("sales.messageFail.exceedRemainQuantityInQuotePart"),
    SALE_MESSAGE_FAIL_QUOTE_HAS_JUST_FINISH_MATCHING("sales.messageFail.quoteHasJustFinishMatching"),
    SALE_MESSAGE_FAIL_WAITING_QUOTE_DELETE("sales.messageFail.quoteDeleted"),
    SALE_MESSAGE_FAIL_WAITING_QUOTE_OUT_OF_DATE("sales.messageFail.waitingQuoteOutOfDate"),
    SALE_MESSAGE_FAIL_MATCHING_EQUIPMENT_WAS_RESERVED_OR_SOLD("sales.messageFail.matchingEquipmentWasReservedOrSold"),
    SALES_MESSAGE_FAIL_ADD_PAYMENT_ERROR("sales.messageFail.addPaymentError"),
    SALES_MESSAGE_FAIL_ADD_RECEIPT_ERROR("sales.messageFail.addReceiptError"),
    SALES_MESSAGE_FAIL_AMOUNT_EXCEED_TOTAL_DUE("sales.messageFail.amountExceedTotalDue"),


    //CUSTOMER
    FAIL_CUSTOMER_UNIT_PHOTO_DELETED("sales.messageFail.customerUnitPhotoDeleted"),
    FAIL_CUSTOMER_UNIT_DELETED("sales.messageFail.customerUnitDeleted"),
    CUSTOMER_ACCESS_DENIED("messageFail.accessDenied"),
    CANNOT_DELETE_CUSTOMER_HAVING_INVOICE_OR_ASSET("sales.messageFail.cannotDeleteCustomerHavingInvoiceOrAsset"),
    CUSTOMER_HAS_BEEN_DELETED("sales.messageFail.customerHasBeenDeleted"),
    QR_CODE_NOT_FOUND("sales.messageFail.qrCodeNotFound"),
    REGISTRATION_NUMBER_IS_USED("sales.messageFail.registrationNumberIsUsed"),
    REGISTRATION_NUMBER_NOT_FOUND("sales.messageFail.registrationNumberNotFound"),
    CANNOT_DELETE_ASSET_HAVING_WORK_ORDER("sales.messageFail.cannotDeleteAssetHavingWorkOrder"),
    CANNOT_CHANGE_DATE_PURCHASED_OF_UNIT_WHICH_ALREADY_BE_MAINTAINED("sales.messageFail.cannotChangeDatePurchasedOfUnitWhichAlreadyBeMaintained"),
    CANNOT_START_WORK_ORDER_WITHOUT_TECHNICIAN("sales.messageFail.cannotStartWorkOrderWithoutTechnician"),
    CUSTOMER_IS_REQUIRED("sales.messageFail.customerIsRequired"),
    LOCALIZED_STRING_NOT_FOUND("messageFail.localizedStringNotFound"),
    PART_REQUISITION_NO_PART_WAS_RECEIVED("partRequisition.messageFail.noPartWasReceived"),
    PART_REQUISITION_RETURN_PART_QUANTITY_TOO_LARGE("partRequisition.messageFail.returnPartQuantityTooLarge"),
    PART_REQUISITION_NO_PART_WAS_RETURNED("partRequisition.messageFail.noPartWasReturned"),

    //customer
    FAIL_INCORRECT_OLDPASSWORD("messageFail.incorrectOldPassword"),
    FAIL_WORK_ORDER_DELETED("sales.messageFail.workOrderDeleted"),
    SERVICE_MESSAGE_FAIL_CAN_NOT_DELETE_CUSTOMER_HAVING_LOAN("service.messageFail.canNotDeleteCustomerHavingLoan"),

    //staff
    USER_HAS_BEEN_ACTIVATED("auth.messageFail.userHasBeenActivated"),
    SALES_MESSAGE_FAIL_DUPLICATE_STAFF_INFORMATION("sales.messageFail.duplicateStaffInformation"),
    SALES_MESSAGE_FAIL_CANNOT_UPDATE_STAFF("sales.messageFail.canNotUpdateStaff"),
    LANGUAGE_OF_STAFF_IS_REQUIRED("sales.messageFail.languageOfStaffIsRequired"),

    //inventory
    FAIL_INVENTORY_PROCESS_FINISHED("sales.messageFail.inventoryProcessFinish"),

    //attachment
    CANNOT_UPDATE_ATTACHMENTS_OF_RESERVED_EQUIPMENT("sales.messageFail.cannotUpdateAttachmentsOfReservedEquipment"),
    CAN_NOT_UPDATE_SOLD_EQUIPMENT("sales.messageFail.canNotUpdateSoldEquipment"),
    CANNOT_ATTACH_EQUIPMENT_OF_ANOTHER_STORE("sales.messageFail.cannotAttachEquipmentOfAnotherStore"),

    //vendor
    VENDOR_EXISTED("sales.messageFail.vendorExisted"),
    FIELD_REQUIRED("sales.messageFail.fieldRequired"),
    CUSTOMER_ALREADY_EXISTS("sales.messageFail.customerAlreadyExists"),
    SUPLLIER_HAS_BEEN_USED("sales.messageFail.supplierHasBeenUsed"),
    SUPPLIER_DUPLICATE_BUSINESS_NAME("sales.messageFail.duplicateBusinessName"),
    //quote part
    QUOTE_PART_SEARCH_ITEM_NOT_FOUND("sales.messageSearchItem.notFound"),
    QUOTE_PART_SEARCH_ITEM_OUT_OF_STOCK("sales.messageSearchItem.outOfStock"),
    FAIL_TOTAL_RECEIVED_EXCEED_QUANTITY("sales.messageFail.totalReceivedExceedQuantity"),
    FAIL_QUANTITY_SMALLER_THAN_TOTAL_RECEIVED("sales.messageFail.quantitySmallerThanTotalReceived"),

    //order unit or part
    SALES_MESSAGE_FAIL_QUOTE_DELETED("sales.messageFail.quoteDeleted"),
    SALES_MESSAGE_FAIL_QUOTE_HAS_JUST_FINISH_MATCHING("sales.messageFail.quoteHasJustFinishMatching"),
    SALES_MESSAGE_FAIL_DUPLICATED_INVOICE_NUMBER("sales.messageFail.duplicateInvoiceNumber"),

    // check in out
    PERMISSION_DENIED("messageFail.permissionDenied"),
    EQUIPMENT_ALREADY_CHECKED_OUT("sales.messageFail.equipmentAlreadyCheckedOut"),
    INVALID_ESTIMATED_RETURN_DATE("sales.messageFail.estimatedReturnInvalid"),
    INVALID_FILE_TYPE("sales.messageFail.fileTypeInvalid"),
    EQUIPMENT_HAS_NOT_BEEN_CHECKED_OUT_YET("sales.messageFail.equipmentHasNotBeenCheckedOutYet"),
    FAIL_PART_ORDER_LINE_ALREADY_EXISTS("sales.messageFail.partOrderLineHasBeenExist"),

    //part import
    FAIL_IMPORT_FORMAT_MISMATCH("importer.messageFail.formatMismatch"),
    CAN_NOT_RESET_PDB_BECAUSE_EXCHANGE_EXISTS("canNotResetPBDBecauseExchangeExists"),
    FAIL_IMPORT_EXTRACTING_FAILS("importer.messageFail.extractingFails"),
    ALREADY_BEGINNING_PART_IMPORTED("importer.messageFail.beginningPartIm" +
            "ported"),
    FAIL_IMPORT_MANUFACTURER_NOT_FOUND("importer.messageFail.manufacturerNotFound"),
    FAIL_IMPORT_SESSION_HAS_BEEN_DELETED("importer.messageFail.sessionHasBeenDeleted"),
    FAIL_IMPORT_SESSION_HAS_BEEN_APPLIED("importer.messageFail.sessionHasBeenApplied"),
    FAIL_IMPORT_ANOTHER_SESSION_IS_OPEN("importer.messageFail.anotherSessionIsOpen"),
    FAIL_IMPORT_DATA_HAS_BEEN_CHANGED("importer.messageFail.dataHasBeenChanged"),
    //part inventory
    SALE_MESAGE_FAIL_SESSION_HAS_BEEN_COMPLETED("sales.messageFail.sessionHasBeenCompleted"),
    SALE_MESAGE_FAIL_CANNOT_JOIN_CLOSED_SESSION("sales.messageFail.canNotJoinClosedSession"),
    SALE_MESSAGE_FAIL_INVALID_CYCLE_COUNT_CONFIGURATION("sales.messageFail.invalidCycleCountConfiguration"),
    SALES_MESSAGE_FAIL_ALREADY_EXISTING_A_FULL_INVENTORY("sales.messageFail.alreadyExistingAFullInventory"),
    SALE_MASSAGE_FAIL_UPDATED_CLOSED_SESSION("sales.messageFail.updateClosedSession"),
    //Color
    SALE_MESSAGE_FAIL_EMPTY_COLOR_VALUE("sales.messageFail.emptyColorValue"),
    SALE_MESSAGE_FAIL_DUPLICATE_COLOR_VALUE("sales.messageFail.duplicateColorValue"),
    //Adjustment
    SALE_MESSAGE_FAILT_NOT_ENOUGH_AVAIABLE_PART_TO_ADJUSTMENT("sales.messageFail.notEnoughAvailablePartToAdjustment"),
    //add new part
    AUTHEN_CAN_NOT_DELETE_COMPANY_WITH_STORE("sales.messageFail.cannotDeleteCompanyWithStore"),
    SALE_MESSAGE_FAIL_DUPLICATE_PART("sales.messageFail.duplicatePart"),
    SALE_MESSAGE_FAIL_DELETE_USED_PART("sales.messageFail.deleteUsedPart"),
    //Transfer Unit
    sales_messageFail_equipmentHasJustTransferredToThisBranch("sales.messageFail.equipmentHasJustTransferredToThisBranch"),
    sales_messageFail_equipmentNotBelongCurrentStore("sales.messageFail.equipmentNotBelongCurrentStore"),
    sales_messageFail_equipmentHasBeenDeleted("sales.messageFail.sessionHasBeenDeleted"),
    sales_messageFail_equipmentDeleted("sales.messageFail.equipmentDeleted"),

    //service
    SALES_MESSAGE_FAILS_TECHNICIAN_NOT_FOUNT("sales.messageFail.technicianNotFound"),
    SALES_MESSAGE_FAILS_ALL_PARTS_MUST_BE_ASSIGNED_BEFORE_FINISH_WORK_ORDER("sales.messageFail.allPartsMustBeAssignedBeforeFinishWorkOrder"),
    CANNOT_START_WORK_ORDER_WITH_ZERO_LABOR_TIME("sales.messageFail.cannotStartWorkOrderWithZeroLaborTime"),
    CANNOT_REQUEST_OUTSIDE_PURCHASE_PART("sales.messageFail.cannotRequestOutsidePurchasePart"),
    CANNOT_DONE_WORK_ORDER_BEFORE_START("sales.messageFail.cannotDoneWorkOrderBeforeStart"),
    CANNOT_DONE_WORK_ORDER_HAVING_RETURNING_PART("sales.messageFail.cannotDoneWorkOrderHavingReturningPart"),
    CUSTOMER_UNIT_DELETED("sales.messageFail.customerUnitDeleted"),

    //Transfer Unit & Part
    CAN_NOT_RECEIVE_PENDING_TRANSFER("sales.messageFail.canNotReceivePendingTransfer"),
    CAN_NOT_RECEIVE_DELETED_TRANSFER("sales.messageFail.canNotReceiveDeletedTransfer"),
    CAN_NOT_UPDATE_NOT_PENDING_TRANSFER("sales.messageFail.canNotUpdateNotPendingTransfer"),
    CAN_NOT_DELETE_NOT_PENDING_TRANSFER("sales.messageFail.canNotDeleteNotPendingTransfer"),
    CAN_NOT_REJECT_NOT_PENDING_TRANSFER("sales.messageFail.canNotRejectNotTransferringTransfer"),
    TRANSFER_CONTAINS_ERROR_LINE("sale.messageFail.transferContainsErrorLine"),
    TRANSFER_PART_QUANTITY_EXCEED_ON_HAND("sales.messageFail.transferPartQuantityExceedOnHand"),
    TRANSFER_CONTAINS_NOT_AVAILABLE_OR_ON_ORDER_EQUIPMENT("sales.messageFail.transferContainsNotAvailableOrOnOrderEquipment"),
    TRANSFER_CONTAINS_DELETED_EQUIPMENT("sales.messageFail.transferContainsDeletedEquipment"),
    TRANSFER_CONTAINS_CHECKED_OUT_EQUIPMENT("sales.messageFail.transferContainsCheckedOutEquipment"),

    //add, delete make
    SALE_MESSGE_FAIL_DUPLICATE_MANUFACTURE_NAME("sales.messageFail.duplicateManufactureName"),
    SALE_MESSAGE_FAIL_IS_ALREADY_IN_USED("messageFail.manufactureIsAlreadyInUsed"),
    SALE_MESSAGE_FAIL_MANUFACTURE_IS_DELETED("messageFail.manufactureIsDeleted"),
    SALE_MESSAGE_FAIL_IS_NOT_FOUND("messageFail.manufactureIsNotFound"),

    DUPLICATE_INVESTOR_INFO("sales.messageFail.duplicateInvestorInfo"),
    INVESTOR_IS_DELETED("sales.messageFail.investorIsDeleted"),
    MESSAGE_FAIL_FINANCE_CAN_NOT_ADJUST_TO_NEGATIVE_BALACNE("messageFail.finance.cannotAdjustToNegativeBalance"),
    INVESTOR_HAS_BEEN_USING("sales.messageFail.investorHasBeenUsed"),
    QUOTE_HAS_AREADY_RESERVED_OR_SOLD("sales.messageFail.cannotPendingSoldCompletedQuote"),
    STAFF_LITE_MESSAGE_FAIL_USED_ACTIVE_CODE("staffLite.messageFail.usedActiveCode"),
    AUTH_MESSAGE_FAIL_CAN_NOT_UPDATE_COMPANY_INDUSTRY("auth.messageFail.canNotUpdateCompanyIndustry"),
    CASH_NOT_BALANCE("sales.messageFail.cashNotBalance"),
    FIXED_ASSET_WAS_ASSIGNED("sales.messageFail.fixedAssetWasAssigned"),
    CAN_NOT_UPDATE_OTHERS_FIXED_ASSET("sales.messageFail.canNotUpdateOthersFixedAsset"),
    CAN_NOT_UNRECEIVE_ASSET_IN_USE("sales.messageFail.canNotUnReceiveAssetInUse"),
    ASSET_WAS_ADDED_TO_SALE("sale.messageFail.assetWasAddedToSale"),
    DUPLICATE_SUPPLIER_INFO("sales.messageFail.duplicateSupplierInfo");

    private String extension;

    MessageKey(String extension)
    {
        this.extension = extension;
    }

    public static MessageKey getValue(String extension)
    {
        for (MessageKey messageKey : values())
        {
            if (messageKey.getExtension().equals(extension))
            {
                return messageKey;
            }
        }
        return null;
    }

    public String getExtension()
    {
        return extension;
    }

    public String getValue()
    {
        return extension;
    }
}
