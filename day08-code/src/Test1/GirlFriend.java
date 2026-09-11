package Test1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String love;

    //针对于每一个私有化的成员变量,都要提供get和set方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>=18 && age<=50){
            this.age = age;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setLove(String love){
        this.love = love;
    }
    public String getLove(){
        return love;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃东西");
    }
}
