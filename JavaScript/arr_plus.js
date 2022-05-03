var arr = [0,1,2,3,4,5,6,7,8,9];
var n=10;
var m=7;
var count = 0;
for(var i=0;i<n;i++){
    for(var j=0;j<n;j++){
        var num = arr[i]+arr[j];
        if(m == num){
            count++;
        }
    }
}
console.log(count);

qemu-system-riscv64 \
    -machine virt \
    -nographic \
    -bios ../bootloader/rustsbi-qemu.bin \
    -device loader,file=target/riscv64gc-unknown-none-elf/release/os.bin,addr=0x80200000 \
    -s -S