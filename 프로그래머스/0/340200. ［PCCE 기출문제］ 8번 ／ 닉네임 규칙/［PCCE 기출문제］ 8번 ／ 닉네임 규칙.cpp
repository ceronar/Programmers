#include <string>
#include <vector>

using namespace std;

string solution(string nickname) {
    string answer = "";
    for(int i=0; i<nickname.size(); i++){
        if(nickname[i] == 'l'){
            answer += "I";
        }
        else if(nickname[i] == 'w'){
            answer += "vv";
        }
        else if(nickname[i] == 'W'){
            answer += "VV";
        }
        else if(nickname[i] == 'O'){
            answer += "0";
        }
        else{
            answer += nickname[i];
        }
    }
    if(answer.size() < 4){ for(int i = 0;answer.size() < 3;i++){answer += "o";}
        answer += "o";
    }
    if(answer.size() > 8){
        answer = answer.substr(0,8);
    }
    return answer;
}