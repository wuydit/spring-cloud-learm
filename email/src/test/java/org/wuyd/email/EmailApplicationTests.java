package org.wuyd.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wuyd.email.entity.MailEntity;
import org.wuyd.email.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMail() throws Exception {
        MailEntity mailEntity = new MailEntity();
        mailEntity.setSubject("邮件测试");
        mailEntity.setRecipient("1557655749@qq.com");
        mailEntity.setContent("邮件测试这是Content");
        mailService.sendSimpleMail(mailEntity);
    }

    @Test
    public void sendHTMLMail() throws Exception {
        MailEntity mailEntity = new MailEntity();
        mailEntity.setSubject("邮件测试");
        mailEntity.setRecipient("1557655749@qq.com");
        mailEntity.setContent("邮件测试这是Content");
        mailService.sendHTMLMail(mailEntity);
    }

    @Test
    public void sendAttachmentMail() throws Exception {
        MailEntity mailEntity = new MailEntity();
        mailEntity.setSubject("邮件测试");
        mailEntity.setRecipient("1557655749@qq.com");
        mailEntity.setContent("邮件测试这是Content");
        mailService.sendAttachmentMail(mailEntity);
    }

    @Test
    public void sendInlineMail() throws Exception {
        MailEntity mailEntity = new MailEntity();
        mailEntity.setSubject("邮件测试");
        mailEntity.setRecipient("1557655749@qq.com");
        mailEntity.setContent("邮件测试这是Content");
        mailService.sendInlineMail(mailEntity);
    }

    @Test
    public void sendTemplateMail() throws Exception {
        MailEntity mailEntity = new MailEntity();
        mailEntity.setSubject("邮件测试");
        mailEntity.setRecipient("1557655749@qq.com");
        mailEntity.setContent("邮件测试这是Content");
        mailService.sendTemplateMail(mailEntity);
    }

}
