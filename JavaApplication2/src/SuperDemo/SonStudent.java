package SuperDemo;
public class SonStudent extends Student{
    private int score;//受保護的score變數
    SonStudent(){//SonStudent方法
        super();  //呼叫Student父類別的Student()建構式
        score=0;
    }
    SonStudent(int weight,int height,int score){  //SonStudent 
        super(weight,height);  //呼叫Student父類別的Student(int weight,int height)方法
        this.score = score; //使用this保留字讓系統辨認資料成員score等於參數score
    }
    void showData(){  //showData方法
        super.showData();  //呼叫父類別的showData方法
        System.out.print("\t成績:"+this.score);  //使用this保留字來讓系統辨認資料成員score為SonStudent方法中的參數score }
        }    
}
