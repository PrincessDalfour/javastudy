## Git使用实例

### 1.重置本地git仓库

```Git
git init
```

### 2.查看当前仓库的状态

```Git
git status
```

### 3.将工作区的修改提交到暂存区

```
git add .
```

### 4.将暂存区的修改提交到当前分支

```
git commit -m '提交信息'
```

### 5.上传到码云云端

```
 git remote add origin https://gitee.com/dalfour/java-study.git
 git push -u origin master
 git pull --rebase origin master
 git push -u origin master   
```

```
git log
###查看日志###

版本回退：可以将当前仓库回退到历史的某个版本
git reset --hard 版本号
git add . 
git commit -m '描述'
git push -f origin master
```

### 6.查看本地分支

    git branch

### 7.切换分支

```
git checkout master
```

### 8.创建分支

```
git checkout -b 分支名称
```

### 9.在主分支上合并子分支

```
git checkout master //切到主分支
git pull origin master //远程下载主分支代码
git merge about//在主分支上合并子分支
git push origin master //将合并后代码上传主分支              
```

> 1.按键盘字母 i 进入insert模式
>
> 2.修改最上面那行黄色合并信息,可以不修改
>
> 3.按键盘左上角"Esc"
>
> 4.输入":wq",注意是冒号+wq,按回车键即可

### 10.切换到子分支

```
git checkout about
```

### 11.向云端推送子分支

```
git push -u origin about
```

### 12.删除分支

```
git branch -d 分支名
```

### 13.第一次使用

```
git config --global user.name "Dalfour"
git config --global user.email "dalfour@163.com"
git init
git add .
git commit -m '提交信息'
git remote add origin https://gitee.com/dalfour/java-study.git
git push -u origin master
```

### 14.第n次使用

```
git add .
git commit -m '提交信息'
git push origin master
```

