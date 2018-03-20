public class student {
    private String name, sex, major;
    private int chinese, english, math;
    public student(String name1, String sex1, String major1, int engScore, int chiScore, int mathScore){
        name = name1;
        sex = sex1;
        major = major1;
        english = engScore;
        chinese = chiScore;
        math = mathScore;
    }
    public void setName(String name) {this.name = name; }
    public void setMajor(String major) {this.major = major;}
    public void setSex(String sex) {this.sex = sex;}

    public String getName() {return name;}
    public String getSex() {return sex; }
    public String getMajor() {return major;}

    public void setEnglish(int english) {this.english = english;}
    public void setChinese(int chinese) {this.chinese = chinese;}
    public void setMath(int math) {this.math = math;}

    public int getEnglish() {return english;}
    public int getChinese() {return chinese;}
    public int getMath() {return math;}

    public void showName (){
        System.out.println(getName());
    }public void showSex () {
        if (getSex().equals("1")) {
            System.out.println("男");
        }else {
            System.out.println("女");
        }
    }
    public void showMajor (){
        System.out.println(getMajor());
    }
    public void showEngScore (){
        System.out.println("英文:"+getEnglish());
    }
    public void showChiScore (){
        System.out.println("國文:"+getChinese());
    }
    public void showMathScore (){
        System.out.println("數學:"+getMath());
    }
}
