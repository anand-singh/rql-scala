package com.esyfur.rql

import com.rethinkdb.{Ql2 => p}

protected class Index(val name: String) {

    protected val termType = null

    def create(): IndexCreate = {
        new IndexCreate
    }

    def drop(): IndexDrop = {
        new IndexDrop
    }

}

class IndexList extends TopLevelQuery {
    protected val termType = p.Term.TermType.INDEX_LIST
}

class IndexCreate extends TopLevelQuery {
    protected val termType = p.Term.TermType.INDEX_CREATE
}

class IndexDrop extends TopLevelQuery {
    protected val termType = p.Term.TermType.INDEX_DROP
}
