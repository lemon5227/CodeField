#include <FS.h>
FSInfo fs_info;

void setup() {
    Serial.begin(9600);

    SPIFFS.begin();
    Serial.println(" ");
    Serial.println(" SPIFFS Start");

    SPIFFS.info(fs_info);

    Serial.print("totalBytes: "); 
    Serial.print(fs_info.totalBytes);
    Serial.println(" Bytes");

    Serial.print("usedBytes: ");
    Serial.print(fs_info.usedBytes);
    Serial.println(" Bytes");

    Serial.print("maxPathLength: ");
    Serial.print(fs_info.maxPathLength);
    
    Serial.print("maxOpenFiles: ");
    Serial.print(fs_info.maxOpenFiles);

    Serial.print("blockSize: ");
    Serial.print(fs_info.blockSize);

    Serial.print("pageSize: ");
    Serial.print(fs_info.pageSize);

}

void loop() {
    
}