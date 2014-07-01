package tansung.dao.impl;

import tansung.dao.IPersonDAO;
import tansung.model.Person;

public class PersonDAO extends AbsPojoDAO<Person, Integer> implements IPersonDAO {
  
  public String getEntityName() {
    return Person.class.getName();
  }

  //���Ǹ���������������ϸ�������ʵ�֡����ص�string����hql��ѯ��ʱ������order by XXX
  public String getOrderField() {
    return "id";
  }

  //ע��Model�����ĸ��ֶ���id
  public String getIdField() {
    return "id";
  }
}
