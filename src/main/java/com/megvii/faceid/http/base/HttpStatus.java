package com.megvii.faceid.http.base;

public enum HttpStatus
{
    CONTINUE(100, "Continue"),
    SWITCHING_PROTOCOLS(101, "Switching Protocols"),

    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NON_AUTHORITATIVE_INFORMATION(203, "Non-Authoritative Information"),
    NO_CONTENT(204, "No Content"),
    RESET_CONTENT(205, "Reset Content"),

    MULTIPLE_CHOICES(300, "Multiple Choices"),
    MOVED_PERMANENTLY(301, "Moved Permanently"),
    FOUND(302, "Found"),
    SEE_OTHER(303, "See Other"),
    USE_PROXY(305, "Use Proxy"),
    UNUSED(306, "Unused"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),

    BAD_REQUEST(400, "Bad Request"),
    NETWORK_ERROR(400, "Network Error"),
    TASK_RUNNING(400, "Task Running"),
    CONTENT_LENGTH(400, "Content Length -1"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "API Not_Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTH_REQUIRED(411, "Length Required"),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
    URI_TOO_LONG(414, "URI Too Long"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type Server Error"),
    FAILED(417, "Failed Server Error"),
    UPGRADE_REQUIRED(426, "Upgrade Required"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    BAD_GATEWAY(502, "Bad_Gateway"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    GATEWAY_TIMEOUT(504, "Gateway Timeout"),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported"),

    UNKNOWN(-1, "Unknown error");

    private final int mStatusCode;
    private final String mMessage;

    HttpStatus(int statusCode, String message)
    {
        this.mStatusCode = statusCode;
        this.mMessage = message;
    }

    public int getStatusCode()
    {
        return mStatusCode;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public static HttpStatus getValue(int value)
    {
        for (HttpStatus httpStatus : values())
        {
            if (value == httpStatus.mStatusCode)
                return httpStatus;
        }
        return UNKNOWN;
    }

    public boolean isSuccess()
    {
        return mStatusCode / 100 == 2;
    }
}
