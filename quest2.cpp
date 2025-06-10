#include <iostream>
using namespace std;


class TaxCalculator{
    
    public:
    int income;
    int age;
    

    // TaxCalculator(int in=0, int a=0, double din=0){
    //     income =in;
    //     age=a;
    //     income=din;

    // }
    int calculateTax(int income ){
        return (income)*10/100;
    }
    int calculateTax(int income , int age){
        if(age<60){
             return (income)*5/100;
        }
        else{
            return (income)*10/100;

        }
 
    }
    double  calculateTax(double income ){
         return (income)*15/100;

    }
};
int main(){
    TaxCalculator t;
    cout << "Enter the income " << endl;
    int h=t.income;
    cin >> h;
    int x =t.calculateTax(h);
    cout << x << endl;
   int y =t.calculateTax(2300.34);
    cout << y << endl;
    int z =t.calculateTax(2300 ,34);
    cout << z << endl;
    int w =t.calculateTax(2300 ,70);
    cout << w << endl;
    return 0;
}