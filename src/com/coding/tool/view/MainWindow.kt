package com.coding.tool.view

import com.coding.tool.util.CMD
import com.coding.tool.util.ToolUtil
import com.coding.tool.view.dialog.*
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame


/**
 * @author: Coding.He
 * @date: 2020/7/13
 * @emil: 229101253@qq.com
 * @des:
 */
class MainWindow : JFrame() {
    init {
        title = "反编译工具"
        val jadxBtn = JButton("jadx")
        jadxBtn.addActionListener {
            CMD.CMD(ToolUtil.getJadx())
        }
        val decompileBtn = JButton("反编译")
        decompileBtn.addActionListener {
            DecompileDialog.showDialog()
        }

        val dex2jarBtn = JButton("dex2jar")
        dex2jarBtn.addActionListener {
            Dex2JarDialog.showDialog()
        }

        val jar2dexBtn = JButton("jar2dex")
        jar2dexBtn.addActionListener {
            Jar2DexDialog.showDialog()
        }

        val backToCompileBtn = JButton("回编译")
        backToCompileBtn.addActionListener {
            BackToApkDialog.showDialog()
        }
        val signBtn = JButton("签名")
        signBtn.addActionListener {
            SignDialog.showDialog()
        }
        val alignBtn = JButton("对齐")
        alignBtn.addActionListener {
            AlignDialog.showDialog()
        }
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = GridLayout(0,2)
        size = Dimension(250, 250)
        setLocationRelativeTo(null)
        add(jadxBtn)
        add(decompileBtn)
        add(dex2jarBtn)
        add(jar2dexBtn)
        add(backToCompileBtn)
        add(signBtn)
        add(alignBtn)
        isVisible = true
        isResizable = false
    }
}