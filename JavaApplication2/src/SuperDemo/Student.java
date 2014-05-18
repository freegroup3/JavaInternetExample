package SuperDemo;
public class Student {
    
         private int weight,height;  //受保護的weight,height變數
         
         Student(){  // Student方法
            weight = 0; height=0;  //初始化weight height
         }
         
         Student(int weight,int height){ //Student方法 
            this.weight = weight;  //使用this保留字來參考目前的類別成員(解決名稱重複的方法)
            this.height = height;  //使用this保留字來辨認資料成員height等於參數height
         }
         
         void showData(){ //showData方法
            System.out.printf("身高:%s \t體重 %s",this.weight, this.height); //使用this保留字讓系統讀取參數weight height
         }    
}
