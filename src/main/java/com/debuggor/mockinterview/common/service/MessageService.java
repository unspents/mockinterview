package com.debuggor.mockinterview.common.service;

import com.debuggor.mockinterview.common.bean.Message;
import com.debuggor.mockinterview.common.dao.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 消息service层
 */
@Service
public class MessageService {

    @Autowired
    private MessageDao messageDao;

    /**
     * 插入一条消息
     *
     * @param message
     */
    public void insert(Message message) {
        messageDao.insert(message);
    }

    /**
     * 更新消息
     *
     * @param message
     */
    public void update(Message message) {
        messageDao.update(message);
    }

    /**
     * 根据订单ID获取消息
     *
     * @param oid
     * @return
     */
    public Message getMessageByOid(Integer oid) {
        Message message = null;
        if (oid != null) {
            message = messageDao.getMessageByOid(oid);
        }
        return message;
    }

    /**
     * 根据用户的ID获取消息
     *
     * @param uid
     * @param userType
     * @return
     */
    public List<Message> getMessageByUid(Integer uid, String userType) {
        List<Message> messages = null;
        if (uid != null && userType != null) {
            messages = messageDao.getMessageByUid(uid, userType);
        }
        return messages;
    }
}
