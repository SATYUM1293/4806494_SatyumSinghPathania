#include math.h
#include stdio.h
#include string.h
#include stdlib.h
#include assert.h
#include limits.h
#include stdbool.h

void string_xor(char s1[], char s2[], char res[]){
    int i;
    for(i=0; s1[i]!='0' && s2[i]!='0'; i++){
        if(s1[i]==s2[i]) res[i] = '0';
        else res[i] = '1';
    }
    res[i] = '0';
}

int main() {
     Enter your code here. Read input from STDIN. Print output to STDOUT 
    char s1[1001], s2[1001], res[1001];
    scanf(%s, s1);
    scanf(%s, s2);
    if(strlen(s1)!=strlen(s2)) return 1;
    string_xor(s1,s2,res);
    printf(%s,res);
    return 0;
}
