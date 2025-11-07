# 📱 Baitap01 – Android Studio

## 👤 Thông tin sinh viên

* **Họ tên:** Đỗ Đoàn Duy Hoàng
* **MSSV:** 23162025

---

## 🎯 Yêu cầu bài tập

✅ Tạo project trên Android Studio
✅ Hiển thị hình + thông tin sinh viên trên app
✅ Ảnh bo tròn sử dụng thư viện:

```gradle
implementation 'de.hdodenhof:circleimageview:3.1.0'
```

✅ Ẩn **ActionBar**
✅ Nhập **mảng số** (ví dụ: `1,2,3,4,5`)
→ In ra Logcat số **chẵn / lẻ** (**EVEN / ODD**)

✅ Nhập **chuỗi bất kỳ**
→ Đảo ngược chuỗi và **in hoa**

---

## 🧠 Xử lý chính (code tóm tắt)

### 🔹 Phân loại số chẵn / lẻ

```kotlin
if (num % 2 == 0)
    Log.d("EVEN", num.toString())
else
    Log.d("ODD", num.toString())
```

### 🔹 Đảo ngược chuỗi + in hoa

```kotlin
String result = reversed.toString().trim().toUpperCase();
```

---

## 🚀 Cách chạy ứng dụng

1. Mở **Android Studio**
2. Chạy app trên **máy ảo AVD** hoặc **thiết bị thật**
3. Nhấn **Run ▶** để chạy ứng dụng

---

## ✅ Kết quả đạt được

* Hiển thị thông tin sinh viên + ảnh bo tròn đẹp
  
  <img width="582" height="1067" alt="image" src="https://github.com/user-attachments/assets/42525176-96fe-4c37-8863-7c64817d3261" />

* In số chẵn / lẻ ra **Logcat** với tag `EVEN` / `ODD`
  
  <img width="581" height="1066" alt="image" src="https://github.com/user-attachments/assets/75a25399-4a9c-41b4-a301-f887da777527" />
  <img width="1919" height="579" alt="image" src="https://github.com/user-attachments/assets/57d62610-3b36-4ed2-b4d8-92d87af0fdfa" />
  <img width="1355" height="92" alt="image" src="https://github.com/user-attachments/assets/2d85b700-a622-4a3e-b339-1723c71c0883" />


* Đảo ngược chuỗi và in hoa kết quả trên màn hình

     <img width="583" height="1072" alt="image" src="https://github.com/user-attachments/assets/985d9772-2935-4672-9bc4-5ba75fdc6de3" />
   
    
---

> 📝 Bài tập Android cơ bản – luyện tập thao tác UI, xử lý dữ liệu số và chuỗi.
