package com.example.message.model;

    public class Message {
        private int id;
        private String content;


        public Message() {

        }

        public Message(int id, String content) {
            this.id = id;
            this.content = content;
        }


        public int getId() {
            return id;
        }

        public String getContent() {
            return content;
        }


        public void setId(int id) {
            this.id = id;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
