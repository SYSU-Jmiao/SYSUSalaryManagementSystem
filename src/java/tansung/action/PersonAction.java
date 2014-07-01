package tansung.action;

import java.util.List;

import tansung.model.Person;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import tansung.service.IPersonService;

public class PersonAction extends ActionSupport {

    private IPersonService service;
    private List<Person> persons;   //Ϊ���ݸ�list.jsp�õ�
    //����3�����ǻ�ȡrequest�Ĳ����õ�
    private Person newPerson;       //Ϊ������û��õ�
    private String id;  //Ϊɾ������׼���ģ�action��������ȡrequest�����Ĳ���
    private String newName; //Ϊ���������õ�

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getNewPerson() {
        return newPerson;
    }

    public void setNewPerson(Person newPerson) {
        this.newPerson = newPerson;
    }

    public IPersonService getService() {
        return service;
    }

    public void setService(IPersonService service) {
        this.service = service;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public String list() {
        this.setPersons(service.listAllPersons());
        return Action.SUCCESS;
    }

    public String add() {
        service.addPerson(newPerson);
        return "listPerson";
    }

    public String delete() {
        service.deletePerson(Integer.parseInt(id));
        return "listPerson";
    }

    public String update() {
        service.updatePerson(Integer.parseInt(id), newName);
        return "listPerson";
    }
}
