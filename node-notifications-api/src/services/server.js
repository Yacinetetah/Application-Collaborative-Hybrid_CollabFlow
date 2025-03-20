const express = require('express');
const { createServer } = require('node:http');
const { Server } = require('socket.io');
const mongoose = require('mongoose');

// Connexion MongoDB
mongoose.connect('mongodb://localhost:27017/collab-logs');

const app = express();
const server = createServer(app);
const io = new Server(server);

io.on('connection', (socket) => {
  console.log('Client connecté');

  socket.on('new-task', (task) => {
    io.emit('task-update', task);
  });

  socket.on('disconnect', () => {
    console.log('Client déconnecté');
  });
});

server.listen(3000, () => {
  console.log('Serveur Node.js sur http://localhost:3000');
});