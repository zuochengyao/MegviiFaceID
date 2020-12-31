package com.megvii.faceid.util;

public final class Const
{
    // region Base
    public static final String API_PARAM_API_KEY = "api_key";
    public static final String API_PARAM_API_SECRET = "api_secret";
    public static final String API_PARAM_SIGN = "sign";
    public static final String API_PARAM_SIGN_VERSION = "sign_version";
    public static final String API_PARAM_REQUEST_ID = "request_id";
    public static final String API_PARAM_TIME_USED = "time_used";
    // endregion

    // region Detect
    public static final String API_PARAM_TOKEN = "token";
    // endregion

    // region IDCard OCR V1
    public static final String API_PARAM_ID_CARD_NUMBER = "id_card_number";
    public static final String API_PARAM_VALID_DATE = "valid_date";
    public static final String API_PARAM_HEAD_RECT = "head_rect";
    public static final String API_PARAM_LEGALITY_ID_PHOTO_V1 = "ID Photo";
    public static final String API_PARAM_LEGALITY_TEMPORARY_ID_PHOTO_V1 = "Temporary ID Photo";
    // endregion

    // region IDCard OCR V2
    public static final String API_PARAM_RETURN_PORTRAIT = "return_portrait";
    public static final String API_PARAM_LOGIC = "logic";
    public static final String API_PARAM_COMPLETENESS = "completeness";
    public static final String API_PARAM_CARD_RECT = "card_rect";
    public static final String API_PARAM_VALID_DATE_START = "valid_date_start";
    public static final String API_PARAM_VALID_DATE_END = "valid_date_end";
    public static final String API_PARAM_LEGALITY_ID_PHOTO_THRESHOLD = "ID_Photo_Threshold";
    public static final String API_PARAM_LEGALITY_ID_PHOTO_V2 = "ID_Photo";
    public static final String API_PARAM_LEGALITY_TEMPORARY_ID_PHOTO_V2 = "Temporary_ID_Photo";
    public static final String API_PARAM_BIRTH_YEAR = "birth_year";
    public static final String API_PARAM_BIRTH_MONTH = "birth_month";
    public static final String API_PARAM_BIRTH_DAY = "birth_day";
    public static final String API_PARAM_NATIONALITY = "nationality";
    // endregion

    // region BankCard
    public static final String API_PARAM_BANK = "bank";
    public static final String API_PARAM_NUMBER = "number";
    public static final String API_PARAM_ORGANIZATION = "organization";
    public static final String API_PARAM_LEFT_BOTTOM = "left_bottom";
    public static final String API_PARAM_RIGHT_TOP = "right_top";
    public static final String API_PARAM_RIGHT_BOTTOM = "right_bottom";
    public static final String API_PARAM_LEFT_TOP = "left_top";
    public static final String API_PARAM_POSITION = "position";
    // endregion

    // region App-GetBizToken & Verify
    public static final String API_PARAM_BIZ_TOKEN = "biz_token";
    public static final String API_PARAM_LIVENESS_TYPE = "liveness_type";
    public static final String API_PARAM_LIVENESS_TIMEOUT = "liveness_timeout";
    public static final String API_PARAM_LIVENESS_ACTION_COUNT = "liveness_action_count";
    public static final String API_PARAM_FACE_REPLACE_DETECTION = "face_replace_detection";
    public static final String API_PARAM_EYES_CLOSE_DETECTION = "eyes_close_detection";
    public static final String API_PARAM_FLASH_LIVENESS_TIMEOUT = "flash_liveness_timeout";
    public static final String API_PARAM_COMPARISON_TYPE = "comparison_type";
    public static final String API_PARAM_FACE_IMAGE_TYPE = "face_image_type";
    public static final String API_PARAM_IDCARD_NAME = "idcard_name";
    private static final String API_PARAM_IMAGE_REF = "image_ref";
    public static final String API_PARAM_IMAGE_REF1 = API_PARAM_IMAGE_REF + "1";
    public static final String API_PARAM_IMAGE_REF2 = API_PARAM_IMAGE_REF + "2";
    public static final String API_PARAM_IMAGE_REF3 = API_PARAM_IMAGE_REF + "3";
    public static final String API_PARAM_UUID = "uuid";
    public static final String API_PARAM_DELTA = "delta";

    public static final String API_PARAM_IMAGE_ENV = "image_env";
    private static final String API_PARAM_IMAGE_ACTION = "image_action";
    public static final String API_PARAM_IMAGE_ACTION1 = API_PARAM_IMAGE_ACTION + "1";
    public static final String API_PARAM_IMAGE_ACTION2 = API_PARAM_IMAGE_ACTION + "2";
    public static final String API_PARAM_IMAGE_ACTION3 = API_PARAM_IMAGE_ACTION + "3";
    public static final String API_PARAM_IMAGE_ACTION4 = API_PARAM_IMAGE_ACTION + "4";
    public static final String API_PARAM_IMAGE_ACTION5 = API_PARAM_IMAGE_ACTION + "5";
    public static final String API_PARAM_CHECK_DELTA = "check_delta";
    public static final String API_PARAM_FACE_TOKEN = "face_token";
    public static final String API_PARAM_FAIL_WHEN_MULTIPLE_FACES = "fail_when_multiple_faces";
    public static final String API_PARAM_FAIL_WHEN_REF_MULTIPLE_FACES = "fail_when_ref_multiple_faces";
    public static final String API_PARAM_FACE_QUALITY_THRESHOLD = "face_quality_threshold";
    public static final String API_PARAM_RETURN_FACES = "return_faces";
    public static final String API_PARAM_MEGLIVE_FLASH_RESULT = "meglive_flash_result";
    public static final String API_PARAM_CONFIDENCE = "confidence";
    public static final String API_PARAM_THRESHOLDS = "thresholds";
    public static final String API_PARAM_THRESHOLDS_1E_3 = "1e-3";
    public static final String API_PARAM_THRESHOLDS_1E_4 = "1e-4";
    public static final String API_PARAM_THRESHOLDS_1E_5 = "1e-5";
    public static final String API_PARAM_THRESHOLDS_1E_6 = "1e-6";
    public static final String API_PARAM_RESULT_FACEID = "result_faceid";
    public static final String API_PARAM_RESULT_REF1 = "result_ref1";
    public static final String API_PARAM_RESULT_REF2 = "result_ref2";
    public static final String API_PARAM_RESULT_REF3 = "result_ref3";
    public static final String API_PARAM_ID_EXCEPTIONS = "id_exceptions";
    public static final String API_PARAM_ID_PHOTO_MONOCHROME = "id_photo_monochrome";
    public static final String API_PARAM_ID_ATTACKED = "id_attacked";
    public static final String API_PARAM_FACE_GENUINENESS = "face_genuineness";
    public static final String API_PARAM_SYNTHETIC_FACE_CONFIDENCE = "synthetic_face_confidence";
    public static final String API_PARAM_SYNTHETIC_FACE_THRESHOLD = "synthetic_face_threshold";
    public static final String API_PARAM_MASK_CONFIDENCE = "mask_confidence";
    public static final String API_PARAM_MASK_THRESHOLD = "mask_threshold";
    public static final String API_PARAM_SCREEN_REPLAY_CONFIDENCE = "screen_replay_confidence";
    public static final String API_PARAM_SCREEN_REPLAY_THRESHOLD = "screen_replay_threshold";
    public static final String API_PARAM_FACE_REPLACED = "face_replaced";
    public static final String API_PARAM_VERBOSE = "verbose";
    public static final String API_PARAM_SECURITY_LEVEL = "security_level";
    public static final String API_PARAM_FORCE_COMPARE = "force_compare";
    public static final String API_PARAM_LIVENESS_LEVEL = "liveness_level";
    public static final String API_PARAM_MAXIMUM_BRIGHTNESS = "maximum_brightness";
    public static final String API_PARAM_MEGLIVE_DATA = "meglive_data";
    public static final String API_PARAM_RESULT_CODE = "result_code";
    public static final String API_PARAM_RESULT_MESSAGE = "result_message";
    public static final String API_PARAM_ATTACK_RESULT = "attack_result";
    // endregion

    // region PC
    public static final String API_PARAM_BIZ_EXTRA_DATA = "biz_extra_data";
    public static final String API_PARAM_SCENE_ID = "scene_id";
    public static final String API_PARAM_SCREEN_REPLAY = "screen_replay";
    public static final String API_PARAM_EXPIRED_TIME = "expired_time";
    public static final String API_PARAM_BIZ_ID = "biz_id";
    public static final String API_PARAM_GET_IMAGE_TYPE = "get_image_type";
    public static final String API_PARAM_LIVENESS_RESULT = "liveness_result";
    public static final String API_PARAM_FAILURE_REASON = "failure_reason";
    public static final String API_PARAM_VERIFY_RESULT = "verify_result";
    // endregion

    // region Lite
    public static final String API_PARAM_WEB_TITLE = "web_title";
    public static final String API_PARAM_IDCARD_MODE = "idcard_mode";
    public static final String API_PARAM_PROCEDURE_TYPE = "procedure_type";
    public static final String API_PARAM_IDCARD_UNEDITABLE_FIELD = "idcard_uneditable_field";
    public static final String API_PARAM_IDCARD_VALID_DATE = "idcard_valid_date";
    public static final String API_PARAM_IDCARD_ISSUED_BY = "idcard_issued_by";
    public static final String API_PARAM_FMP_MODE = "fmp_mode";
    public static final String API_PARAM_BIZ_INFO = "biz_info";
    public static final String API_PARAM_IDCARD_INFO = "idcard_info";
    public static final String API_PARAM_IDCARD_MODE_USER = "idcard_mode_user";
    public static final String API_PARAM_FRONT_SIDE = "front_side";
    public static final String API_PARAM_BACK_SIDE = "back_side";
    public static final String API_PARAM_OCR_RESULT = "ocr_result";
    public static final String API_PARAM_UPLOAD_TIMES_LOWERCASE = "upload_times";
    public static final String API_PARAM_OCR_FRONT_QUALITY = "ocr_front_quality";
    public static final String API_PARAM_OCR_BACK_QUALITY = "ocr_back_quality";
    public static final String API_PARAM_UPLOAD_TIMES_UPPERCASE = "UPLOAD_TIMES";
    public static final String API_PARAM_FACE_NOT_FOUND_UPPERCASE = "FACE_NOT_FOUND";
    public static final String API_PARAM_LOW_FACE_QUALITY_UPPERCASE = "LOW_FACE_QUALITY";
    public static final String API_PARAM_INVALID_VIDEO_DURATION_UPPERCASE = "INVALID_VIDEO_DURATION";
    public static final String API_PARAM_SR_ERROR_UPPERCASE = "SR_ERROR";
    public static final String API_PARAM_NOT_SYNCHRONIZED_UPPERCASE = "NOT_SYNCHRONIZED";
    public static final String API_PARAM_NO_AUDIO_UPPERCASE = "NO_AUDIO";
    public static final String API_PARAM_VIDEO_FORMAT_UNSUPPORTED_UPPERCASE = "VIDEO_FORMAT_UNSUPPORTED";
    public static final String API_PARAM_FACE_FRONT = "face_front";
    public static final String API_PARAM_FACE_SIDE = "face_side";
    public static final String API_PARAM_FACE_UPLOAD_TIMES_UPPERCASE = "FACE_UPLOAD_TIMES";
    public static final String API_PARAM_FACE_BLURRED_UPPERCASE = "FACE_BLURRED";
    public static final String API_PARAM_FACE_MULTIPLE_FACES_UPPERCASE = "FACE_MULTIPLE_FACES";
    public static final String API_PARAM_FACE_POOR_LIGHT_UPPERCASE = "FACE_POOR_LIGHT";
    public static final String API_PARAM_FACE_NOT_FRONT_UPPERCASE = "FACE_NOT_FRONT";
    public static final String API_PARAM_FACE_NOT_SIDE_UPPERCASE = "FACE_NOT_SIDE";
    public static final String API_PARAM_FACE_NOT_PROPER_POSITION_UPPERCASE = "FACE_NOT_PROPER_POSITION";
    public static final String API_PARAM_UNSUPPORTED_FORMAT_UPPERCASE = "UNSUPPORTED_FORMAT";
    public static final String API_PARAM_VIDEO_FACE_INCONSISTENT_UPPERCASE = "VIDEO_FACE_INCONSISTENT";
    public static final String API_PARAM_SELFIE_INCONSISTENT = "selfie_inconsistent";
    public static final String API_PARAM_SELFIE_METADATA_INCONSISTENT = "selfie_metadata_inconsistent";
    public static final String API_PARAM_RESULT_IDCARD_PHOTO = "result_idcard_photo";
    public static final String API_PARAM_RESULT_IDCARD_DATASOURCE = "result_idcard_datasource";
    public static final String API_PARAM_IMAGE_IDCARD_BACK = "image_idcard_back";
    public static final String API_PARAM_IMAGE_IDCARD_FRONT = "image_idcard_front";
    public static final String API_PARAM_IMAGE_FACE_FRONT = "image_face_front";
    public static final String API_PARAM_IMAGE_FACE_SIDE = "image_face_side";
    // endregion

    // region Raw
    public static final String API_PARAM_TOKEN_RANDOM_NUMBER = "token_random_number";
    public static final String API_PARAM_RANDOM_NUMBER = "random_number";
    public static final String API_PARAM_VIDEO = "video";
    public static final String API_PARAM_TOKEN_VIDEO = "token_video";
    public static final String API_PARAM_PROCEDURE_VALIDATION = "procedure_validation";
    public static final String API_PARAM_SELFIE = "selfie";
    public static final String API_PARAM_TOKEN_FRONT_FACE = "token_front_face";
    public static final String API_PARAM_TOKEN_SIDE_FACE = "token_side_face";
    public static final String API_PARAM_TOKEN_STILL = "token_still";
    // endregion

    // region Common
    public static final String API_PARAM_ERROR = "error";
    public static final String API_PARAM_ERROR_MESSAGE = "error_message";
    public static final String API_PARAM_IMAGE_BEST = "image_best";
    public static final String API_PARAM_IMAGE = "image";
    public static final String API_PARAM_QUALITY_THRESHOLD = "quality_threshold";
    public static final String API_PARAM_RT = "rt";
    public static final String API_PARAM_LT = "lt";
    public static final String API_PARAM_RB = "rb";
    public static final String API_PARAM_LB = "lb";
    public static final String API_PARAM_ISSUED_BY = "issued_by";
    public static final String API_PARAM_LEGALITY = "legality";
    public static final String API_PARAM_LEGALITY_EDITED = "Edited";
    public static final String API_PARAM_LEGALITY_PHOTOCOPY = "Photocopy";
    public static final String API_PARAM_LEGALITY_SCREEN = "Screen";
    public static final String API_PARAM_IDCARD_NUMBER = "idcard_number";
    public static final String API_PARAM_BIZ_NO = "biz_no";
    public static final String API_PARAM_MULTI_ORIENTED_DETECTION = "multi_oriented_detection";
    public static final String API_PARAM_RETURN_URL = "return_url";
    public static final String API_PARAM_NOTIFY_URL = "notify_url";
    public static final String API_PARAM_RETURN_IMAGE = "return_image";
    public static final String API_PARAM_LIVENESS_PREFERENCES = "liveness_preferences";
    // endregion

    // region Host URL
    public static final String API_HOST_URL_CHINA = "https://api.megvii.com";
    // public static final String API_HOST_URL_CHINA_IPV6 = "https://api-ipv6.megvii.com";
    public static final String API_HOST_URL_CHINA_IDN = "https://api-idn.megvii.com";
    public static final String API_HOST_URL_CHINA_SGP = "https://api-sgp.megvii.com";
    // endregion
}
