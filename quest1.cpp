#include <iostream>

using namespace std;

class ElectronicItem{
    public:
    string itemName;
    int weight;
    string originCity;
   

};

class HomeAppliance : public ElectronicItem{
    public:
    float powerRating;
    int recyclablePlasticPercent;

    void getData1(){
         cout << "Enter Item name" << endl;
        cin >> itemName;
        cout << "Enter Item weight" << endl;
        cin >> weight;
       
        cout << "Enter originCity" << endl;
        cin >> originCity;
        cout << "Enter powerRating" << endl;
        cin >> powerRating;
        cout << "Enter recyclablePlasticPercent" << endl;
        cin >> recyclablePlasticPercent;
    }

    void putData1(){
            cout << " Item name\n" << " "<<itemName << endl;
            cout << " Item weight\n" << " "<< weight<< endl;
            cout << " Item weight\n" << " "<< originCity<< endl;
            cout << " originCity\n" << " "<<powerRating << endl;
            cout << " recyclablePlasticPercent\n" << " "<<recyclablePlasticPercent << endl;


    }

    void listDevice(int n1){
           for (int i = 0; i < n1; i++)
    {
 if(recyclablePlasticPercent >70){
    cout << "The number of items with recyclablePlasticPercent more than 70 are " <<endl;

      cout <<   itemName << endl;
    }    
}

    }
    
};
class MobileDevice : public ElectronicItem{
   public:
    int batteryCapacity;
    string hasScreenCrack;


        void getData2(){
         cout << "Enter Item name" << endl;
        cin >> itemName;
        cout << "Enter Item weight" << endl;
        cin >> weight;
       
        cout << "Enter originCity" << endl;
        cin >> originCity;
        cout << "Enter batteryCapacity" << endl;
        cin >> batteryCapacity;
        cout << "Enter hasScreenCrack" << endl;
        cin >> hasScreenCrack;
    }
     void putData2(){
            cout << " Item name\n" <<itemName <<" "<< endl;
            cout << " Item weight\n" << weight<<" "<< endl;
            cout << " Item weight\n" << originCity<<" "<< endl;
            cout << " originCity\n" <<batteryCapacity <<" "<< endl;
            cout << " recyclablePlasticPercent\n" <<hasScreenCrack <<" "<< endl;
     }
        void countBatterycap(int n2){
        int count=0;
          for (int i = 0; i < n2; i++)
    {
 if(batteryCapacity >3000){
        
        count++;
    }  
    }
    cout << "The number of items with battery capacity more than 3000 are " << count<<endl;


    }



 
};


int main(){
    int n1,n2,count=0;
    HomeAppliance h[30];
    MobileDevice m[30];

    
    cout << " Enter the number of HomeAppliance items" << endl;
    cin >> n1;
    for(int i =0; i < n1;i++){
       h[i].getData1();
    }
        for(int i =0; i < n1;i++){
        h[i].putData1();
    }

      
    cout << " Enter the number of MobileDevice items" << endl;
    cin >> n2;
    for(int i =0; i < n2;i++){
        m[i].getData2();
    }
        for(int i =0; i < 4;i++){
        m[i].putData2();
    }



//     for (int i = 0; i < n1; i++)
//     {
//  if(h[i].recyclablePlasticPercent >70){
//     cout << "The number of items with recyclablePlasticPercent more than 70 are " <<endl;

//       cout <<   h[i].itemName << endl;
//     }    
// }


//    for (int i = 0; i < n2; i++)
//     {
//  if(m[i].batteryCapacity >3000){
//         m[i].itemName;
//         count++;
//     }    
// }
// cout << "The number of items with battery capacity more than 3000 are " << count<<endl;
    
 h->listDevice(n1);
 m->countBatterycap(n2);
    return 0;
}