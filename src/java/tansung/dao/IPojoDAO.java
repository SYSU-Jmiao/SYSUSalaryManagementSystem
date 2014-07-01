package tansung.dao;

import java.util.Collection;
import java.util.List;
import java.io.Serializable;
import org.hibernate.Query;

/**
 * ���ݿ���ʶ���Ĺ����ӿڣ�����Pojo�����˸ö���ɷ��ʵĳ־û�ʵ������ͣ�
 * Key�Ƕ�Ӧ�ĳ־û�ʵ����������͡�
 */
public interface IPojoDAO<Pojo, Key extends Serializable> {

    /**
     * ����һ��ʵ��
     */
    void save(Pojo obj);

    /**
     * ����һ��ʵ��ļ��ϣ���������е�ʵ���Ѵ��������ݣ�ִ�и��²���
     */
    void save(Collection<Pojo> list);

    /**
     * ����һ��ʵ��
     */
    void update(Pojo obj);

    /**
     * ��������һ��ʵ��
     */
    void saveOrUpdate(Pojo obj);

    /**
     * ����ʵ�������ֵ����ʵ��
     */
    Pojo findByKey(Key key);

    /**
     *ɾ��һ��ʵ��
     */
    void delete(Pojo obj);

    /**
     *����һ��ʵ�������ֵɾ��һ��ʵ��
     */
    void deleteByKey(Key key);

    /**
     * ɾ����ʵ��ӳ������������
     */
    void deleteAll();

    /**
     * �������ݿ����Ƿ����ӵ�и�����ֵ��ʵ�壬���򷵻�true
     */
    boolean testKey(Key key);

    /**
     * �������ݿ����Ƿ����ӵ�и��ֶ�ֵ��ʵ�壬���򷵻�true
     */
    boolean testField(String field, Key value);

    /**
     * ��ָ���ֶν�������isDesc��������������
     * ����ֶ���ʹ�á�,��������ֱ��ƴ�ӵ�hql����У�
     */
    List<Pojo> listOrderBy(String field, boolean isDesc);

    /**
     * ��ָ���ֶν�������isDesc��������������
     * ����ֶ���ʹ�á�,��������ֱ��ƴ�ӵ�hql����У�
     * ���з�ҳ��ѯ����
     * @param page ��1��ʼ
     * @return
     */
    List<Pojo> listOrderBy(int page, int size, String field, boolean isDesc);

    /**
     * �г�����ʵ��
     */
    List<Pojo> list();

    /**
     * ��ҳ�г�����ʵ��
     * @param page ��1��ʼ
     */
    List<Pojo> list(int page, int size);

    /**
     * �����г�����ʵ��
     */
    List<Pojo> listDesc();

    /**
     * �����г�����ʵ��
     * @param page ��1��ʼ
     */
    List<Pojo> listDesc(int page, int size);

    /**
     * �г����и�ʵ�����������ʵ�壬��ϸ��Hibernate��findByExample����
     */
    List<Pojo> listByExample(Pojo example);

    /**
     * �г����и�ʵ�����������ʵ�壬��ϸ��Hibernate��findByExample���������з�ҳ����
     * @param page ��1��ʼ
     */
    List<Pojo> listByExample(Pojo example, int page, int size);

    /**
     * ����һ��HQL������в�ѯ
     * ���Ƽ�ʹ�ã���Ϊֱ����bll�����Query������
     */
    Query createQuery(String hql);

    /**
     * ����hql��ѯ���ʵ���б�
     */
    public List<Pojo> findByHQL(String hql);

    /**
     * ��ȡ��ʵ�������ݿ��еĸ���
     */
    int getCount();

    /**
     * ��ȡ��ʵ����ָ���ķ�ҳ��С�������ݿ��ҳ��
     * @return
     */
    int getPageCount(int size);
}
