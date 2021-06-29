
SUMMARY = "Brings async, event-driven capabilities to Django. Django 2.2 and up only."
HOMEPAGE = "http://github.com/django/channels"
AUTHOR = "Django Software Foundation <foundation@djangoproject.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/24/69/9ff1c6ce90bfc23a98e64d1b25e236895f5ba350d7235401861d7582d460/channels-3.0.3.tar.gz"
SRC_URI[md5sum] = "9185920460d2afd67f74a1855a5b6d4d"
SRC_URI[sha256sum] = "056b72e51080a517a0f33a0a30003e03833b551d75394d6636c885d4edb8188f"

S = "${WORKDIR}/channels-3.0.3"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django python3-asgiref python3-daphne"

BBCLASSEXTEND = "native nativesdk"
