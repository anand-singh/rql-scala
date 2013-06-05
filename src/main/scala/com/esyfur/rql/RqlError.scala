package com.esyfur.rql

class RqlError(message: String) extends Exception {

}

case class RqlClientError(message: String) extends RqlError(message) {

}

case class RqlCompileError(message: String) extends RqlError(message) {

}

case class RqlRuntimeError(message: String) extends RqlError(message) {

}

case class RqlDriverError(message: String) extends Exception(message) {

}