package CheerfulGarden.session;

import CheerfulGarden.persistance.HibernateUtil;
import org.hibernate.*;
import org.hibernate.jdbc.ReturningWork;
import org.hibernate.jdbc.Work;
import org.hibernate.stat.SessionStatistics;

import java.io.Serializable;
import java.sql.Connection;

public class SessionCreator {
    private static SessionCreator instance;
    private Session session;

    private SessionCreator() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    public static SessionCreator getInstance() {
        if (instance == null) {
            instance = new SessionCreator();
        }
        return instance;
    }

    public SharedSessionBuilder sessionWithOptions() {
        return session.sessionWithOptions();
    }

    public void flush() throws HibernateException {
        session.flush();
    }

    public void setFlushMode(FlushMode flushMode) {
        session.setFlushMode(flushMode);
    }

    public FlushMode getFlushMode() {
        return session.getFlushMode();
    }

    public void setCacheMode(CacheMode cacheMode) {
        session.setCacheMode(cacheMode);
    }

    public CacheMode getCacheMode() {
        return session.getCacheMode();
    }

    public SessionFactory getSessionFactory() {
        return session.getSessionFactory();
    }

    public Connection close() throws HibernateException {
        return session.close();
    }

    public void cancelQuery() throws HibernateException {
        session.cancelQuery();
    }

    public boolean isOpen() {
        return session.isOpen();
    }

    public boolean isConnected() {
        return session.isConnected();
    }

    public boolean isDirty() throws HibernateException {
        return session.isDirty();
    }

    public boolean isDefaultReadOnly() {
        return session.isDefaultReadOnly();
    }

    public void setDefaultReadOnly(boolean b) {
        session.setDefaultReadOnly(b);
    }

    public Serializable getIdentifier(Object o) {
        return session.getIdentifier(o);
    }

    public boolean contains(Object o) {
        return session.contains(o);
    }

    public void evict(Object o) {
        session.evict(o);
    }

    @Deprecated
    public Object load(Class aClass, Serializable serializable, LockMode lockMode) {
        return session.load(aClass, serializable, lockMode);
    }

    public Object load(Class aClass, Serializable serializable, LockOptions lockOptions) {
        return session.load(aClass, serializable, lockOptions);
    }

    @Deprecated
    public Object load(String s, Serializable serializable, LockMode lockMode) {
        return session.load(s, serializable, lockMode);
    }

    public Object load(String s, Serializable serializable, LockOptions lockOptions) {
        return session.load(s, serializable, lockOptions);
    }

    public Object load(Class aClass, Serializable serializable) {
        return session.load(aClass, serializable);
    }

    public Object load(String s, Serializable serializable) {
        return session.load(s, serializable);
    }

    public void load(Object o, Serializable serializable) {
        session.load(o, serializable);
    }

    public void replicate(Object o, ReplicationMode replicationMode) {
        session.replicate(o, replicationMode);
    }

    public void replicate(String s, Object o, ReplicationMode replicationMode) {
        session.replicate(s, o, replicationMode);
    }

    public Serializable save(Object o) {
        return session.save(o);
    }

    public Serializable save(String s, Object o) {
        return session.save(s, o);
    }

    public void saveOrUpdate(Object o) {
        session.saveOrUpdate(o);
    }

    public void saveOrUpdate(String s, Object o) {
        session.saveOrUpdate(s, o);
    }

    public void update(Object o) {
        session.update(o);
    }

    public void update(String s, Object o) {
        session.update(s, o);
    }

    public Object merge(Object o) {
        return session.merge(o);
    }

    public Object merge(String s, Object o) {
        return session.merge(s, o);
    }

    public void persist(Object o) {
        session.persist(o);
    }

    public void persist(String s, Object o) {
        session.persist(s, o);
    }

    public void delete(Object o) {
        session.delete(o);
    }

    public void delete(String s, Object o) {
        session.delete(s, o);
    }

    @Deprecated
    public void lock(Object o, LockMode lockMode) {
        session.lock(o, lockMode);
    }

    @Deprecated
    public void lock(String s, Object o, LockMode lockMode) {
        session.lock(s, o, lockMode);
    }

    public Session.LockRequest buildLockRequest(LockOptions lockOptions) {
        return session.buildLockRequest(lockOptions);
    }

    public void refresh(Object o) {
        session.refresh(o);
    }

    public void refresh(String s, Object o) {
        session.refresh(s, o);
    }

    @Deprecated
    public void refresh(Object o, LockMode lockMode) {
        session.refresh(o, lockMode);
    }

    public void refresh(Object o, LockOptions lockOptions) {
        session.refresh(o, lockOptions);
    }

    public void refresh(String s, Object o, LockOptions lockOptions) {
        session.refresh(s, o, lockOptions);
    }

    public LockMode getCurrentLockMode(Object o) {
        return session.getCurrentLockMode(o);
    }

    public Query createFilter(Object o, String s) {
        return session.createFilter(o, s);
    }

    public void clear() {
        session.clear();
    }

    public Object get(Class aClass, Serializable serializable) {
        return session.get(aClass, serializable);
    }

    @Deprecated
    public Object get(Class aClass, Serializable serializable, LockMode lockMode) {
        return session.get(aClass, serializable, lockMode);
    }

    public Object get(Class aClass, Serializable serializable, LockOptions lockOptions) {
        return session.get(aClass, serializable, lockOptions);
    }

    public Object get(String s, Serializable serializable) {
        return session.get(s, serializable);
    }

    @Deprecated
    public Object get(String s, Serializable serializable, LockMode lockMode) {
        return session.get(s, serializable, lockMode);
    }

    public Object get(String s, Serializable serializable, LockOptions lockOptions) {
        return session.get(s, serializable, lockOptions);
    }

    public String getEntityName(Object o) {
        return session.getEntityName(o);
    }

    public IdentifierLoadAccess byId(String s) {
        return session.byId(s);
    }

    public IdentifierLoadAccess byId(Class aClass) {
        return session.byId(aClass);
    }

    public NaturalIdLoadAccess byNaturalId(String s) {
        return session.byNaturalId(s);
    }

    public NaturalIdLoadAccess byNaturalId(Class aClass) {
        return session.byNaturalId(aClass);
    }

    public SimpleNaturalIdLoadAccess bySimpleNaturalId(String s) {
        return session.bySimpleNaturalId(s);
    }

    public SimpleNaturalIdLoadAccess bySimpleNaturalId(Class aClass) {
        return session.bySimpleNaturalId(aClass);
    }

    public Filter enableFilter(String s) {
        return session.enableFilter(s);
    }

    public Filter getEnabledFilter(String s) {
        return session.getEnabledFilter(s);
    }

    public void disableFilter(String s) {
        session.disableFilter(s);
    }

    public SessionStatistics getStatistics() {
        return session.getStatistics();
    }

    public boolean isReadOnly(Object o) {
        return session.isReadOnly(o);
    }

    public void setReadOnly(Object o, boolean b) {
        session.setReadOnly(o, b);
    }

    public void doWork(Work work) throws HibernateException {
        session.doWork(work);
    }

    public <T> T doReturningWork(ReturningWork<T> returningWork) throws HibernateException {
        return session.doReturningWork(returningWork);
    }

    public Connection disconnect() {
        return session.disconnect();
    }

    public void reconnect(Connection connection) {
        session.reconnect(connection);
    }

    public boolean isFetchProfileEnabled(String s) throws UnknownProfileException {
        return session.isFetchProfileEnabled(s);
    }

    public void enableFetchProfile(String s) throws UnknownProfileException {
        session.enableFetchProfile(s);
    }

    public void disableFetchProfile(String s) throws UnknownProfileException {
        session.disableFetchProfile(s);
    }

    public TypeHelper getTypeHelper() {
        return session.getTypeHelper();
    }

    public LobHelper getLobHelper() {
        return session.getLobHelper();
    }

    public String getTenantIdentifier() {
        return session.getTenantIdentifier();
    }

    public Transaction beginTransaction() {
        return session.beginTransaction();
    }

    public Transaction getTransaction() {
        return session.getTransaction();
    }

    public Query getNamedQuery(String s) {
        return session.getNamedQuery(s);
    }

    public Query createQuery(String s) {
        return session.createQuery(s);
    }

    public SQLQuery createSQLQuery(String s) {
        return session.createSQLQuery(s);
    }

    public Criteria createCriteria(Class aClass) {
        return session.createCriteria(aClass);
    }

    public Criteria createCriteria(Class aClass, String s) {
        return session.createCriteria(aClass, s);
    }

    public Criteria createCriteria(String s) {
        return session.createCriteria(s);
    }

    public Criteria createCriteria(String s, String s1) {
        return session.createCriteria(s, s1);
    }
}
