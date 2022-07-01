# GetExtension

拡張子一覧を取得する。

## 動作環境

Java 1.8で確認。

## 実行

1. ```target```配下からjarファイル取得
2. 下記実行
    ```
    java -cp GetExtension-${ツールバージョン}-SNAPSHOT-jar-with-dependencies.jar -cp tool.extension.GetExtension ${対象ディレクトリ} > ${取得結果出力ファイル}
    ```