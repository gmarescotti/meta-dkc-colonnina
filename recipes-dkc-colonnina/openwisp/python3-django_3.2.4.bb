
SUMMARY = "A high-level Python Web framework that encourages rapid development and clean, pragmatic design."
HOMEPAGE = "https://www.djangoproject.com/"
AUTHOR = "Django Software Foundation <foundation@djangoproject.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/27/94/123b3a95e9965819a3d30d36da6fc12ddff83bcfb0099f3e15437347480a/Django-3.2.4.tar.gz"
SRC_URI[md5sum] = "2f30db9154efb8c9ed891781d29fae2a"
SRC_URI[sha256sum] = "66c9d8db8cc6fe938a28b7887c1596e42d522e27618562517cc8929eb7e7f296"

S = "${WORKDIR}/Django-3.2.4"

DEPENDS += " "
RDEPENDS_${PN} = "python3-asgiref python3-pytz python3-sqlparse"

BBCLASSEXTEND = "native nativesdk"
