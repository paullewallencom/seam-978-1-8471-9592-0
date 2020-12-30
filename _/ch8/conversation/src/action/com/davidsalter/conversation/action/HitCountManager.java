package com.davidsalter.conversation.action;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;

/**
 * Sample source code for Chapter 8 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Stateful
@Name("hitCount")
@Scope(ScopeType.CONVERSATION)
public class HitCountManager implements HitCount {

  @Out
  private int count = 99;
  @Out
  private int id=10;

  @Begin(join = true)
  public String start() {
    count = 1;
    System.out.println("Start:" + count);
    return "/conversation.xhtml";
  }

  @Begin(join = true)
  public String placeBid() {
    return "success";
  }

  public String increment() {
    count++;
    System.out.println("Increment:" + count);
    return "";
  }

  @End
  public String end() {
    count = 0;
    System.out.println("End:" + count);
    return "/home.xhtml";
  }

  @Remove
  public void destroy() {
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  
}
