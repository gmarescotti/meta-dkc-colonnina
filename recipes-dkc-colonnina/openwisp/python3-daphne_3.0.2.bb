
SUMMARY = "Django ASGI (HTTP/WebSocket) server"
HOMEPAGE = "https://github.com/django/daphne"
AUTHOR = "Django Software Foundation <foundation@djangoproject.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/76/da/69bd8eee1e52e595690965d70ea873c6b128053cd199914365c58c8b7b28/daphne-3.0.2.tar.gz"
SRC_URI[md5sum] = "e0513a72c93649d91c226fe61e82115c"
SRC_URI[sha256sum] = "76ffae916ba3aa66b46996c14fa713e46004788167a4873d647544e750e0e99f"

S = "${WORKDIR}/daphne-3.0.2"

DEPENDS += " ${PYTHON_PN}-pytest-runner-native"
RDEPENDS_${PN} = "python3-twisted python3-autobahn python3-asgiref"

BBCLASSEXTEND = "native nativesdk"
