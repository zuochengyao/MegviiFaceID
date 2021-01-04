package com.megvii.faceid.http.base;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HttpHeader implements Map<String, String>
{
    public final static String HEADER_ACCEPT = "Accept";
    public final static String HEADER_PRAGMA = "Pragma";
    public final static String HEADER_PROXY_CONNECTION = "Proxy-Connection";
    public final static String HEADER_USER_AGENT = "User-Agent";
    public final static String HEADER_ACCEPT_ENCODING = "accept-encoding";
    public final static String HEADER_CACHE_CONTROL = "Cache-Control";
    public final static String HEADER_CONTENT_ENCODING = "Content-Encoding";
    public final static String HEADER_CONNECTION = "Connection";
    public final static String HEADER_CONTENT_LENGTH = "Content-length";
    public final static String HEADER_CONTENT_TYPE = "Content-Type";
    public final static String HEADER_CHARSET = "Charset";

    private final Map<String, String> mMap;

    public HttpHeader()
    {
        mMap = new HashMap<>();
    }

    // region Getter and Setter for IHttpHeader

    public String getAccept()
    {
        return get(HEADER_ACCEPT);
    }

    public void setAccept(String value)
    {
        put(HEADER_ACCEPT, value);
    }

    public String getPragma()
    {
        return get(HEADER_PRAGMA);
    }

    public void setPragma(String value)
    {
        put(HEADER_PRAGMA, value);
    }

    public String getUserAgent()
    {
        return get(HEADER_USER_AGENT);
    }

    public void setUserAgent(String value)
    {
        put(HEADER_USER_AGENT, value);
    }

    public String getProxyConnection()
    {
        return get(HEADER_PROXY_CONNECTION);
    }

    public void setProxyConnection(String value)
    {
        put(HEADER_PROXY_CONNECTION, value);
    }

    public String getAcceptEncoding()
    {
        return get(HEADER_ACCEPT_ENCODING);
    }

    public void setAcceptEncoding(String value)
    {
        put(HEADER_ACCEPT_ENCODING, value);
    }

    public String getCacheControl()
    {
        return get(HEADER_CACHE_CONTROL);
    }

    public void setCacheControl(String value)
    {
        put(HEADER_CACHE_CONTROL, value);
    }

    public String getContentEncoding()
    {
        return get(HEADER_CONTENT_ENCODING);
    }

    public void setContentEncoding(String value)
    {
        put(HEADER_CONTENT_ENCODING, value);
    }

    public String getConnection()
    {
        return get(HEADER_CONNECTION);
    }

    public void setConnection(String value)
    {
        put(HEADER_CONNECTION, value);
    }

    public String getContentLength()
    {
        return get(HEADER_CONTENT_LENGTH);
    }

    public void setContentLength(String value)
    {
        put(HEADER_CONTENT_LENGTH, value);
    }

    public String getContentType()
    {
        return get(HEADER_CONTENT_TYPE);
    }

    public void setContentType(String value)
    {
        put(HEADER_CONTENT_TYPE, value);
    }

    public String getCharset()
    {
        return get(HEADER_CHARSET);
    }

    public void setCharset(String charset)
    {
        put(HEADER_CHARSET, charset);
    }

    // endregion

    // region implements Map
    @Override
    public int size()
    {
        return mMap.size();
    }

    @Override
    public boolean isEmpty()
    {
        return mMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key)
    {
        return mMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value)
    {
        return mMap.containsValue(value);
    }


    @Override
    public String get(Object key)
    {
        return mMap.get(key);
    }


    @Override
    public String put(String key, String value)
    {
        return mMap.put(key, value);
    }


    @Override
    public String remove(Object key)
    {
        return mMap.remove(key);
    }

    @Override
    public void putAll(@NotNull Map<? extends String, ? extends String> m)
    {
        mMap.putAll(m);
    }

    @Override
    public void clear()
    {
        mMap.clear();
    }


    @NotNull
    @Override
    public Set<String> keySet()
    {
        return mMap.keySet();
    }


    @NotNull
    @Override
    public Collection<String> values()
    {
        return mMap.values();
    }


    @NotNull
    @Override
    public Set<Entry<String, String>> entrySet()
    {
        return mMap.entrySet();
    }

    // endregion
}
