CREATE DATABASE ANISONG;
USE ANISONG;
CREATE TABLE songs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,       -- 限制长度防止恶意输入
    author VARCHAR(100),               -- 作者
    original_lyric TEXT,               -- 完整原始歌词（用于导入时处理）
    translated_lyric TEXT,             -- 完整中文翻译（方便全文检索）
    created_at DATETIME DEFAULT NOW(), -- 记录创建时间
    updated_at DATETIME DEFAULT NOW()  -- 最后修改时间（自动更新）
);

CREATE TABLE lyric_lines (
    id INT PRIMARY KEY AUTO_INCREMENT,
    song_id INT NOT NULL,               -- 外键约束保证数据完整
    line_number INT NOT NULL,           -- 确保歌词顺序
    content VARCHAR(255) NOT NULL,      -- 单行长度限制（兼容PDF排版）
    FOREIGN KEY (song_id) REFERENCES songs(id)
);

CREATE TABLE ruby_annotations (
    id INT PRIMARY KEY AUTO_INCREMENT,
    line_id INT NOT NULL,               -- 精确到行级注音
    ruby_text VARCHAR(255) NOT NULL,    -- 注音内容（平假名/片假名）
    is_modified BOOLEAN DEFAULT FALSE,  -- 标识用户修改状态
    created_at DATETIME DEFAULT NOW(),  -- 注音生成/修改时间
    FOREIGN KEY (line_id) REFERENCES lyric_lines(id)
);

