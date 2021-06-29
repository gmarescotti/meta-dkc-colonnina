
SUMMARY = "Distributed Task Queue."
HOMEPAGE = "http://celeryproject.org"
AUTHOR = "Ask Solem <auvipy@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=714ade8234d6e3ec5b162ab38f44cb9e"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/66/60/2713f5be1906b81d40f823f4c30f095f7b97b9ccf3627abe1c79b1e2fd15/celery-5.1.2.tar.gz"
SRC_URI[md5sum] = "9bba7b2ef6ab3a53056009795859e39d"
SRC_URI[sha256sum] = "8d9a3de9162965e97f8e8cc584c67aad83b3f7a267584fa47701ed11c3e0d4b0"

S = "${WORKDIR}/celery-5.1.2"

DEPENDS += " "
RDEPENDS_${PN} = "python3-pytz python3-billiard python3-kombu python3-vine python3-click python3-click-didyoumean python3-click-repl python3-click-plugins python3-setuptools"

BBCLASSEXTEND = "native nativesdk"
