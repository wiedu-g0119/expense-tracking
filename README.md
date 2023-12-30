# Expense Tracking

這是一個用於追蹤個人或團隊開銷的Spring Boot應用程式。它提供了一個RESTful API，可以用來創建、讀取、更新和刪除開銷記錄。

## 主要功能

- **創建開銷記錄**：使用者可以創建一個新的開銷記錄，包括名稱和金額。
- **讀取開銷記錄**：使用者可以查看所有的開銷記錄，或者查看特定的開銷記錄。
- **更新開銷記錄**：使用者可以更新現有的開銷記錄，包括名稱和金額。
- **刪除開銷記錄**：使用者可以刪除現有的開銷記錄。

## 技術棧

- **Spring Boot**：用於創建應用程式的主要框架。
- **Spring Data JPA**：用於數據持久化。
- **H2 Database**：用於開發和測試的內存數據庫。

## 如何運行

1. 克隆此存儲庫到您的本地機器。
2. 在命令行中，導航到存儲庫的根目錄。
3. 執行`mvnw spring-boot:run`命令來啟動應用程式。
4. 在瀏覽器中，訪問`http://localhost:8080/api/expenses`來查看所有的開銷記錄。

## API 使用方法

以下是如何使用 cURL 呼叫每支 API 的範例：

1. 獲取所有的開銷記錄：
    ```sh
    curl -X GET http://localhost:8080/api/expenses
    ```

2. 獲取特定 ID 的開銷記錄（將 `{id}` 替換為實際的 ID）：
    ```sh
    curl -X GET http://localhost:8080/api/expenses/{id}
    ```

3. 創建一個新的開銷記錄（將 `{json}` 替換為實際的 JSON 數據）：
    ```sh
    curl -X POST -H "Content-Type: application/json" -d '{json}' http://localhost:8080/api/expenses
    ```

4. 更新特定 ID 的開銷記錄（將 `{id}` 和 `{json}` 替換為實際的 ID 和 JSON 數據）：
    ```sh
    curl -X PUT -H "Content-Type: application/json" -d '{json}' http://localhost:8080/api/expenses/{id}
    ```

5. 刪除特定 ID 的開銷記錄（將 `{id}` 替換為實際的 ID）：
    ```sh
    curl -X DELETE http://localhost:8080/api/expenses/{id}
    ```

請注意，這些命令假設你的應用程式正在本地主機的 8080 端口上運行。如果你的應用程式在其他地方運行，請將 `localhost:8080` 替換為實際的主機名和端口。

## 如何貢獻

我們歡迎所有對此專案感興趣的開發者參與貢獻。如果您有任何問題或建議，請開啟一個新的問題。如果您想要貢獻代碼，請開啟一個新的拉取請求。