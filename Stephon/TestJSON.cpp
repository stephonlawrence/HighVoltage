#include "rapidjson/document.h"
#include "rapidjson/filewritestream.h"
#include <iostream>
#include <cstdio>

using namespace rapidjson;
using namespace std;

int main() {
    

    const char json[] = "[1, 2, 3, 4]";

    Document d;
    d.Parse(json);
    FILE* fp = fopen("test.json", "wb");
    int choice = 1;
    while(choice > 0){
        cout << endl << "end of program: " << endl;
        cin >> choice;
    }
    return 0;
}
