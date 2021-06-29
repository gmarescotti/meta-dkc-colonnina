
SUMMARY = "Integrated set of Django applications addressing authentication, registration, account management as well as 3rd party (social) account authentication."
HOMEPAGE = "http://github.com/pennersr/django-allauth"
AUTHOR = "Raymond Penners <raymond.penners@intenct.nl>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a565c738a3e2f9bb42c617b3468d56d"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/70/8c/18e9fd164b0e1e578995cf916da49a074b22a629a71c6017455d1ba151e1/django-allauth-0.44.0.tar.gz"
SRC_URI[md5sum] = "6b748ca2a9282187dfd7ad516da4167b"
SRC_URI[sha256sum] = "e51af457466022f52154d74c8523ac69375120fad2acce6e239635d85e610b25"

S = "${WORKDIR}/django-allauth-0.44.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
