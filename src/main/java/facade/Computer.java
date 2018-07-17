package facade;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 11:35
 */
public class Computer {

    CPU cpu;
    Memory memory;
    Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("hihi，电脑启动成功");
    }
}
