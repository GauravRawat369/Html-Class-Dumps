// class q2{
//     void solver(int n,int a)
//     {
//         int cnt1 = 1;
//         int cnt2 = 1;
//         int b = a;
//         int c = a;
//         boolean f1 = true;
//         boolean f2 = true;
//         while(b != a && c != a)
//         {
//             if(f1)
//             {
//                 cnt1++;
//                 if(f2)
//                 {
//                     b = b*a;
//                     f2 = false;
//                 }
//                 else
//                 {
//                     b = b*b;
//                     f2 = true;
//                 }
//                 f1 = false;
//             }
//             else
//             {
//                 cnt2++;
//                 if(!f2)
//                 {
//                     b=b*b;
//                     f2 = false;
//                 }
//                 else
//             }
//         }
        


    


class q2{

    void solver(int a, int n) {
        System.out.println(pow(a, n));
    }
    int pow(int a, int n) {
        if (n == 1) {
            return a;
        }
        if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return pow(a * a, n / 2) * a;
        }
    }

    public static void main(String[] args) {
        q2 obj = new q2();
        obj.solver(2, 3);
    }

}
