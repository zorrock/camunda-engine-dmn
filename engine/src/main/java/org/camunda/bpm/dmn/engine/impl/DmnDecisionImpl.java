package org.camunda.bpm.dmn.engine.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;

public class DmnDecisionImpl implements DmnDecision {

  protected String key;
  protected String name;
  protected DmnDecisionTableImpl decisionTable;
  
  protected Collection<DmnDecision> requiredDecision = new ArrayList<DmnDecision>();

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRelatedDecisionTable(DmnDecisionTableImpl decisionTable) {
    this.decisionTable = decisionTable;   
  }

  public DmnDecisionTableImpl getRelatedDecisionTable() {
    return decisionTable;
  }

  public void setRequiredDecision(List<DmnDecision> requiredDecision) {
    this.requiredDecision = requiredDecision;
  }

  @Override
  public Collection<DmnDecision> getRequiredDecisions() {
    return requiredDecision;
  }

  @Override
  public boolean isDecisionTable() {
    return true;
  }

  @Override
  public String toString() {
    return "DmnDecisionTableImpl{" +
      " key= "+ key +
      ", name= "+ name +
      ", decisionTable=" + decisionTable +
      ", requiredDecision=" + requiredDecision +
      '}';
  }
}