package cn.linshio.pojo;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User(null, "az", "12", 22);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
