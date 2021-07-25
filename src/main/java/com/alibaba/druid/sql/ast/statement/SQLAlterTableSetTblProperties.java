package com.alibaba.druid.sql.ast.statement;

import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.SQLObjectImpl;
import com.alibaba.druid.sql.visitor.SQLASTVisitor;

import java.util.LinkedHashMap;
import java.util.Map;

public class SQLAlterTableSetTblProperties extends SQLObjectImpl implements SQLAlterTableItem {
  private Map<String, SQLObject> properties = new LinkedHashMap<>();

  public Map<String, SQLObject> getProperties() {
    return properties;
  }

  @Override
  protected void accept0(SQLASTVisitor v) {
    v.visit(this);
    v.endVisit(this);
  }
}
