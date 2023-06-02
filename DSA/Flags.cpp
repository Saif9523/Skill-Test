long long find_Ways(int N)
{
    /* Don't write main().
   * Don't read input, it is passed as function argument.
   * Taking input and printing output is handled automatically.
  */

    if(N==1 || N==2) return 2;
    
    long long ans=find_Ways(N-1)+find_Ways(N-2);
    
    return ans;

}

