package com.mysite.sbb.Reply.controller;

import com.mysite.sbb.Reply.dao.ReplyRepository;
import com.mysite.sbb.Reply.domain.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/reply")
public class ReplyController {

  @Autowired
  private ReplyRepository replyRepository;

  @RequestMapping("/list")
  @ResponseBody
  public List<Reply> showReply() {
    return replyRepository.findAll();
  }
}