package com.niulipeng;

/**
 * 安装并破解IDEA
 * 安装：解压到指定文件夹，找到bin下exe启动程序，选择免费进入界面
 * 破解：将agent.jar文件放入解压的文件夹下，IDEA界面HELP->Edit Custom VM Option->然后添加如下参数：
 * -javaagent:F:\idea\ideaIU-2019.2.3.win\ideaIU-2019.2.3.win\jetbrains-agent.jar
 * 然后关闭IDEA,重启之后HELP->register->licenserver->输入以下地址：
 * https://fls.jetbrains-agent.com。然后active即可。重启IDEA生效
 *  File-setting或者快捷行里的小扳手 设置字体等（勾选change by mouse） quick documentation
 *  手动导包 ALT+ENTRT 自动导包 Edit-Genneral-auto import(可以自动添加去除包)
 *  code Complition里的match case去掉勾选可以不区分大小写提示
 * editor-color scheme-Language Defaults-commets修改注释的颜色
 * File and Code Templates-includes可以修改每次编写的模板
 * /**
 * * @Auther:niulipeng
 * * @Date:${DATE}
 * * @Description:${PACKAGE_NAME}
 * * @Version:1.0
 * /
 * File encoding  修改编码格式 右下角可以展示当前文档的编码格式
 * 代码自动编译 build-complier-勾选build和complie
 * File下 power save modle省电模式下不提示
 * 右键当前文档 split Vertically 水平展示和竖直展示
 * 导入jar包 File-setting下的那个目录-librarices
 */
public class Setting {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int[] arr = {52,12,35,46,19,22,30};
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
