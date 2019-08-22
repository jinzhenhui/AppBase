package com.app.base.net;

/**
 * @Description
 * @Author Zhenhui
 * @Time 2019/8/15 10:32
 */
public interface LibBaseHttpCallback<T> {

    /**
     * 判断成功的规则
     *
     * @param result
     * @return
     */
    boolean isSuccessful(T result);

    /**
     * 开始
     */
    void onStart();

    /**
     * 成功
     *
     * @param result
     * @return
     */
    void onSuccess(T result);

    /**
     * api返回失败数据
     *
     * @param result
     * @return
     */
    void onFailed(T result);

    /**
     * 请求错误
     *
     * @param e
     */
    void onError(Throwable e);

}