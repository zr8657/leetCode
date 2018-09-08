There is a table courses with columns: student and class

Please list out all classes which have more than or equal to 5 students.

For example, the table:

+---------+------------+
| student | class      |
+---------+------------+
| A       | Math       |
| B       | English    |
| C       | Math       |
| D       | Biology    |
| E       | Math       |
| F       | Computer   |
| G       | Math       |
| H       | Math       |
| I       | Math       |
+---------+------------+
Should output:

+---------+
| class   |
+---------+
| Math    |
+---------+
Note:
The students should not be counted duplicate in each course.

您是否在真实的面试环节中遇到过这道题目呢？  
题目难度：简单
通过次数：2.7K
提交次数：9.2K
贡献者：LeetCode
MySQL	

1
# Write your MySQL query statement below
2
 select a.class from ( select  class from courses group by class,student) a    group by a.class having count(*)>=5