<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8">
    <title>4eachblog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  
  <body>
    <?php
    
    
    mb_internal_encoding("utf8");
    $pdo = new PDO("mysql:dbname=lesson001;host=localhost;","root","mysql");
    
    $stmt = $pdo->query("select * from 4each_keijiban");
    
    
    ?>

    
    <header>
      <div class="header-logo">
      <img src="4eachblog_logo.jpg">
      </div>
      
      <div class="header-list">
        <ul>
          <li>トップ</li>
          <li>プロフィール</li>
          <li>4eachについて</li>
          <li>登録フォーム</li>
          <li>問い合わせ</li>
          <li>その他</li>
        </ul>
      </div>
    </header>
    
    <main>
      <div class="main-center">
        <h1>プログラミングに役立つ掲示板</h1>

        <div class="kakiko">
          <h2>入力フォーム</h2>
          <form method="post" action="insert.php">
            <div>
              <label>ハンドルネーム</label>
              <br>
              <input type="text" class="text" size="25" name="handlename">
            </div>

            <div>
              <label>タイトル</label>
              <br>
              <input type="text" class="text" size="25" name="title">
            </div>

            <div>
              <label>コメント</label>
              <br>
              <textarea rows="6" cols="50" name="comments"></textarea>
            </div>

            <div>
              <input type="submit" class="submit" value="投稿する">
            </div>
          </form>
        </div>
      </div>
      
      <div class="main-right">
        <h2>人気の記事</h2>
        <ul>
          <li>PHPオススメ本</li>
          <li>PHP Myadminの使い方</li>
          <li>いま人気のエディタTop5</li>
          <li>HTMLの基礎</li>
        </ul>
        <h2>オススメリンク</h2>
          <ul>
          <li>インターノウス株式会社</li>
          <li>XAMPPのダウロード</li>
          <li>Eclipseのダウンロード</li>
          <li>Braketsのダウロード</li>
        </ul>
        
        <h2>カテゴリ</h2>
        <ul>
          <li>HTML</li>
          <li>PHP</li>
          <li>MySQL</li>
          <li>javaScript</li>
        </ul>
      </div>
      
      
        <?php
        echo " <div class='kiji'> ";
        echo " <h2>タイトル</h2> ";
        echo " <div class=‘contents’> ";
        echo "記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。
        記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br>
        記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br>
        記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br> ";
        echo "<div class='handlename'>posted by 通りすがり</div> ";
        echo "</div> ";
        echo "</div> ";

        ?>
      
      <?php
        while($row = $stmt->fetch()){
                                     echo "<div class='kiji'>";
                                     echo "<h2>".$row['title']."</h2>";
                                     echo "<div class='contents'>";
                                     echo $row['comments'];
                                     echo "<div class='handlename'>postedby".$row['handlename']."</div>";
                                     echo "</div>";
                                     echo "</div>";
                                    }
      
      ?>
      


        
    </main>
    
    <footer>
      copyright internous | 4each blog is the one provides A to Z about programing.
    </footer>
  
  </body>


</html>