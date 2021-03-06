package com.debuggor.mockinterview.interview.dao;

import com.debuggor.mockinterview.interview.bean.Interviewer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 面试官dao层
 */
@Repository
public interface InterviewerDao {
    /**
     * 根据邮箱，获取面试官信息；用邮箱唯一标示面试官
     *
     * @param email
     * @return
     */
    Interviewer getInterviewerByEmail(String email);

    /**
     * 面试官注册
     *
     * @param interviewer
     */
    void insert(Interviewer interviewer);

    /**
     * 跟新面试官状态：是否激活
     *
     * @param code
     * @return
     */
    Integer updateActivate(String code);

    /**
     * 根据面试官的ID，获取面试官的信息
     *
     * @param iid
     * @return
     */
    Interviewer getInterviewerById(Integer iid);

    /**
     * 跟新面试官信息
     *
     * @param interviewer
     */
    void update(Interviewer interviewer);

    /**
     * 获取num位热门的面试官信息
     *
     * @param num
     * @return
     */
    List<Interviewer> getInterviewerHot(Integer num);

    /**
     * 获取面试官数量
     *
     * @return
     */
    Integer getInterviewerNum();
}
