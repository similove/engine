const path = require('path');
const webpack = require('webpack');
const htmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
  mode: "none",
  entry: './src/main.js',
  output: {
    path: path.resolve(__dirname, './dist'),
    filename: 'bundle.js'
  },
  devServer: {
    open: true,
    port: 8000,
    contentBase: 'src',
    hot: true
  },
  plugins: [
    new webpack.HotModuleReplacementPlugin(),
    new htmlWebpackPlugin({
      template: path.resolve(__dirname, './src/index.html'),
      filename: 'index.html'
    })
  ],
  module: {
    rules: [
      {test: /\.css$/, use: ['style-loader', 'css-loader']}, //cnpm i
      {test: /\.less$/, use: ['style-loader', 'css-loader', 'less-loader']},
      {test: /\.scss$/, use: ['style-loader', 'css-loader', 'sass-loader']},
      {test: /\.(jpg|png|gif|jpeg)$/, use: "url-loader?limit=101765&name=[hash:8]-[name].jpg"},
      {test: /\.(ttf|eot|svg|woff|woff2)$/, use: "url-loader"},
      {test: /\.js$/, use: "babel-loader", exclude: /node_modules/},
      {test: /\.vue$/, use: 'vue-loader'}
    ]
  },

  resolve: {
    alias: { // 修改vue被导入时候的包路径
      // 'vue$': 'vue/dist/vue.js'
    }
  }
};
