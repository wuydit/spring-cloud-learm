package org.wuyd.email.service;

import org.wuyd.email.entity.MailEntity;

/**
 * @author wuyd
 * @version 1.0
 * @description TODO
 * @time 2019/4/2 16:00
 */
public interface MailService {
    /**
     * 发送简单格式邮件
     * @param mailEntity
     */
    void sendSimpleMail(MailEntity mailEntity);

    /**
     * 发送HTML格式邮件
     * @param mailEntity
     */
    void sendHTMLMail(MailEntity mailEntity);

    /**
     * 发送带附件格式的邮件
     *
     * @param mailEntity
     */
    void sendAttachmentMail(MailEntity mailEntity);
    /**
     * 发送带静态资源的邮件
     *
     * @param mailEntity
     */
    void sendInlineMail(MailEntity mailEntity);
    /**
     * 发送基于Freemarker模板的邮件
     *
     * @param mailEntity
     */
    void sendTemplateMail(MailEntity mailEntity);
}
