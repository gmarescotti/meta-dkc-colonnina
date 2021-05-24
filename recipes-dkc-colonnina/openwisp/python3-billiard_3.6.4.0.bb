
SUMMARY = "Python multiprocessing fork with improvements and bugfixes"
HOMEPAGE = "https://github.com/celery/billiard"
AUTHOR = "R Oudkerk / Python Software Foundation <python-dev@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b027ff51564b1ddea7790c64ea873713"

SRC_URI = "https://files.pythonhosted.org/packages/92/91/40de1901da8ec9eeb7c6a22143ba5d55d8aaa790761ca31342cedcd5c793/billiard-3.6.4.0.tar.gz"
SRC_URI[md5sum] = "b49503b8a78743dcb6a86accea379357"
SRC_URI[sha256sum] = "299de5a8da28a783d51b197d496bef4f1595dd023a93a4f59dde1886ae905547"

S = "${WORKDIR}/billiard-3.6.4.0"

RDEPENDS_${PN} = ""

inherit setuptools3
