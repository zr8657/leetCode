package org.webmaic.example;

import org.hibernate.validator.constraints.SafeHtml;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webmaic.example.util.WebdriverUtil;

import java.lang.reflect.Array;
import java.util.*;

public class L_226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        handler(root);
        return root;
    }
    public void handler(TreeNode root){
        if(root.left != null || root.right != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        if(root.left != null){
            handler(root.left);
        }
        if(root.right != null){
            handler(root.right);
        }
    }

}
