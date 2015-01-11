#include "rapidjson/document.h"
#include "rapidjson/writer.h"
#include "rapidjson/stringbuffer.h"
#include <fstream>
#include <iostream>
#include <cstdio>

using namespace rapidjson;
using namespace std;

int main() {
    
    ofstream fs;
    fs.open("test.json");
    const char* json = "{\"project\":\"rapidjson\",\"stars\":10}";
    Document d;
    d.Parse(json);

    Value& s = d["stars"];
    s.SetInt(s.GetInt() + 1);

    StringBuffer buffer;
    Writer<StringBuffer> writer(buffer);
    d.Accept(writer);

    fs << buffer.GetString();
    cout << buffer.GetString() << endl;

    int choice = 1;
    while(choice > 0){
        cout << endl << "end of program: " << endl;
        cin >> choice;
    }
    return 0;
}
